package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.mds.annotations.Ignore;
import org.motechproject.openlmiscore.exception.DataException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

@Entity
public class ProgramSupported {

    @Field
    private Long facilityId;

    @Field
    private Program program;

    @Field
    private String facilityCode;

    @Field
    private Boolean active = false;

    @Field
    private Date startDate;

    @Field
    private List<FacilityProgramProduct> programProducts;

    @Ignore
    public void isValid() {
        if (this.active && this.startDate == null) {
            throw new DataException("supported.programs.invalid");
        }
    }

    public ProgramSupported(Long programId, Boolean active, Date startDate) {
        this.program = new Program(programId);
        this.active = active;
        this.startDate = startDate;
    }

    public ProgramSupported(Long facilityId, Program program, String facilityCode, Boolean active, Date startDate, List<FacilityProgramProduct> programProducts) {
        this.facilityId = facilityId;
        this.program = program;
        this.facilityCode = facilityCode;
        this.active = active;
        this.startDate = startDate;
        this.programProducts = programProducts;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public List<FacilityProgramProduct> getProgramProducts() {
        return programProducts;
    }

    public void setProgramProducts(List<FacilityProgramProduct> programProducts) {
        this.programProducts = programProducts;
    }

    @Ignore
    public String getStringStartDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return this.startDate == null ? null : simpleDateFormat.format(this.startDate);
    }

    @Ignore
    public Double getWhoRatioFor(final String productCode) {
        FacilityProgramProduct facilityProgramProduct = (FacilityProgramProduct) CollectionUtils.find(this.getProgramProducts(), new Predicate() {
            @Override
            public boolean evaluate(Object o) {
                return ((FacilityProgramProduct) o).getProduct().getCode().equals(productCode);
            }
        });
        return (facilityProgramProduct == null) ? null : facilityProgramProduct.getWhoRatio();
    }

    @Ignore
    public Integer getPackSizeFor(final String productCode) {
        FacilityProgramProduct facilityProgramProduct = (FacilityProgramProduct) CollectionUtils.find(this.getProgramProducts(), new Predicate() {
            @Override
            public boolean evaluate(Object o) {
                return ((FacilityProgramProduct) o).getProduct().getCode().equals(productCode);
            }
        });
        return (facilityProgramProduct == null) ? null : facilityProgramProduct.getProduct().getPackSize();
    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProgramSupported that = (ProgramSupported) o;

        if (facilityId != null ? !facilityId.equals(that.facilityId) : that.facilityId != null) {
            return false;
        }
        if (!program.equals(that.program)) {
            return false;
        }
        if (!facilityCode.equals(that.facilityCode)) {
            return false;
        }
        if (!active.equals(that.active)) {
            return false;
        }
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) {
            return false;
        }
        return !(programProducts != null ? !programProducts.equals(that.programProducts) : that.programProducts != null);

    }

    @Override
    public int hashCode() {
        int result = facilityId != null ? facilityId.hashCode() : 0;
        result = 31 * result + program.hashCode();
        result = 31 * result + facilityCode.hashCode();
        result = 31 * result + active.hashCode();
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (programProducts != null ? programProducts.hashCode() : 0);
        return result;
    }
}
