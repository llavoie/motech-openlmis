package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

@Entity
public class ProgramProductIdealStockAmount {

    @Field
    private Long programProductId;

    @Field
    private IdealStockAmount idealStockAmount;

    public ProgramProductIdealStockAmount() {
        idealStockAmount = new IdealStockAmount();
    }

    public Integer calculate(Long population) {
        return idealStockAmount.calculate(population);
    }

    public Double getWhoRatio() {
        return idealStockAmount.getWhoRatio();
    }

    public void setWhoRatio(Double whoRatio) {
        idealStockAmount.setWhoRatio(whoRatio);
    }

    public Integer getDosesPerYear() {
        return idealStockAmount.getDosesPerYear();
    }

    public void setDosesPerYear(Integer dosesPerYear) {
        idealStockAmount.setDosesPerYear(dosesPerYear);
    }

    public Double getWastageFactor() {
        return idealStockAmount.getWastageFactor();
    }

    public void setWastageFactor(Double wastageFactor) {
        idealStockAmount.setWastageFactor(wastageFactor);
    }

    public Double getBufferPercentage() {
        return idealStockAmount.getBufferPercentage();
    }

    public void setBufferPercentage(Double bufferPercentage) {
        idealStockAmount.setBufferPercentage(bufferPercentage);
    }

    public Integer getMinimumValue() {
        return idealStockAmount.getMinimumValue();
    }

    public void setMinimumValue(Integer minimumValue) {
        idealStockAmount.setMinimumValue(minimumValue);
    }

    public Integer getMaximumValue() {
        return idealStockAmount.getMaximumValue();
    }

    public void setMaximumValue(Integer maximumValue) {
        idealStockAmount.setMaximumValue(maximumValue);
    }

    public Integer getAdjustmentValue() {
        return idealStockAmount.getAdjustmentValue();
    }

    public void setAdjustmentValue(Integer adjustmentValue) {
        idealStockAmount.setAdjustmentValue(adjustmentValue);
    }

    public Long getPopulationSource() {
        return idealStockAmount.getPopulationSource();
    }

    public void setPopulationSource(Long sourceId) {
        idealStockAmount.setPopulationSource(sourceId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProgramProductIdealStockAmount that = (ProgramProductIdealStockAmount) o;

        if (programProductId != null ? !programProductId.equals(that.programProductId) : that.programProductId != null) {
            return false;
        }
        return !(idealStockAmount != null ? !idealStockAmount.equals(that.idealStockAmount) : that.idealStockAmount != null);

    }

    @Override
    public int hashCode() {
        int result = programProductId != null ? programProductId.hashCode() : 0;
        result = 31 * result + (idealStockAmount != null ? idealStockAmount.hashCode() : 0);
        return result;
    }
}
