package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.motechproject.mds.annotations.Field;
import org.motechproject.mds.annotations.Ignore;

import java.util.List;


@Entity
public class FacilityProgramProduct extends ProgramProduct {

    @Field
    private Long facilityId;

    @Field
    private IdealStockAmount overriddenIsa;

    public FacilityProgramProduct(ProgramProduct programProduct, Long facilityId) {
        this(programProduct, facilityId, null);
    }

    public FacilityProgramProduct(ProgramProduct programProduct, Long facilityId, IdealStockAmount isa) {
        super(programProduct);
        this.facilityId = facilityId;
        this.overriddenIsa = isa;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public IdealStockAmount getOverriddenIsa() {
        return overriddenIsa;
    }

    public void setOverriddenIsa(IdealStockAmount overriddenIsa) {
        this.overriddenIsa = overriddenIsa;
    }

    @Ignore
    public ProductGroup getActiveProductGroup() {
        if (this.isActive() && this.getProduct().isActive()) {
            return this.getProduct().getProductGroup();
        }
        return null;
    }

    /**
     * Calculates the ideal stock amount (ISA) the facility should be stocked to
     * with the associated product.
     * @param population the population of the facility that will be served by the
     *   product's stock.
     * @param numberOfMonthsInPeriod the number of months the ideal stock amount
     *   will need to serve the facility.
     * @return the ideal stock amount of the associated product for the associated
     *   facility or null if the ISA is not calculable.
     */
    public Integer calculateIsa(Long population, Integer numberOfMonthsInPeriod) {
        if (population == null) {
            return null;
        }

        Integer idealQuantity;
        if (this.overriddenIsa != null) {
            idealQuantity = this.overriddenIsa.calculate(population);
        } else if (this.getProgramProductIdealStockAmount() != null) {
            idealQuantity = this.getProgramProductIdealStockAmount().calculate(population);
        } else {
            return null;
        }

        idealQuantity = idealQuantity * numberOfMonthsInPeriod;
        return idealQuantity < 0 ? 0 : idealQuantity;
    }

    /**
     * Calculates the ideal stock amount (ISA) in terms of pack size.  i.e. the
     * number of whole deliverable units that a facility would be stocked to for the associated
     * product.
     * @return the number of whole deliverable units of the associated product that meets or
     * exceeds the ISA or null if the ISA is not calculable.
     * @see #calculateIsa(Long, Integer)
     */
    public Integer calculateIsaByPackSize(Long population, Integer numberOfMonthsInPeriod) {
        Integer idealQuantity = calculateIsa(population, numberOfMonthsInPeriod);
        if (idealQuantity == null) {
            return null;
        }

        return new Double(Math.ceil((float) idealQuantity / this.getProduct().getPackSize())).intValue();
    }


    @Ignore
    public Double getWhoRatio() {
        if (this.overriddenIsa != null) {
            return overriddenIsa.getWhoRatio();
        } else if (this.getProgramProductIdealStockAmount() != null) {
            return getProgramProductIdealStockAmount().getWhoRatio();
        } else {
            return null;
        }
    }

    public static List<FacilityProgramProduct> filterActiveProducts(List<FacilityProgramProduct> programProducts) {
        List<FacilityProgramProduct> activeProgramProducts = (List<FacilityProgramProduct>) CollectionUtils.select(programProducts, new Predicate() {
            @Override
            public boolean evaluate(Object o) {
                FacilityProgramProduct programProduct = (FacilityProgramProduct) o;
                return programProduct.isActive() && programProduct.getProduct().isActive();
            }
        });
        return activeProgramProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FacilityProgramProduct that = (FacilityProgramProduct) o;

        if (facilityId != null ? !facilityId.equals(that.facilityId) : that.facilityId != null) {
            return false;
        }
        return !(overriddenIsa != null ? !overriddenIsa.equals(that.overriddenIsa) : that.overriddenIsa != null);

    }

    @Override
    public int hashCode() {
        int result = facilityId != null ? facilityId.hashCode() : 0;
        result = 31 * result + (overriddenIsa != null ? overriddenIsa.hashCode() : 0);
        return result;
    }
}
