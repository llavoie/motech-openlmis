package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

@Entity
public class IdealStockAmount {

    private static final int MONTHS_IN_YEAR = 12;
    private static final int ONE_HUNDRED = 100;

    @Field
    private Double whoRatio;

    @Field
    private Integer dosesPerYear;

    @Field
    private Double wastageFactor;

    @Field
    private Double bufferPercentage;

    @Field
    private Integer minimumValue;

    @Field
    private Integer maximumValue;

    @Field
    private Integer adjustmentValue;

    //For Tanzania
    @Field
    private Long populationSource;

    public IdealStockAmount() {
    }

    public IdealStockAmount(Double whoRatio, Integer dosesPerYear, Double wastageFactor, Double bufferPercentage,
                            Integer minimumValue, Integer maximumValue, Integer adjustmentValue, Long populationSource) {
        this.whoRatio = whoRatio;
        this.dosesPerYear = dosesPerYear;
        this.wastageFactor = wastageFactor;
        this.bufferPercentage = bufferPercentage;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.adjustmentValue = adjustmentValue;
        this.populationSource = populationSource;
    }

    public Double getWhoRatio() {
        return whoRatio;
    }

    public void setWhoRatio(Double whoRatio) {
        this.whoRatio = whoRatio;
    }

    public Integer getDosesPerYear() {
        return dosesPerYear;
    }

    public void setDosesPerYear(Integer dosesPerYear) {
        this.dosesPerYear = dosesPerYear;
    }

    public Double getWastageFactor() {
        return wastageFactor;
    }

    public void setWastageFactor(Double wastageFactor) {
        this.wastageFactor = wastageFactor;
    }

    public Double getBufferPercentage() {
        return bufferPercentage;
    }

    public void setBufferPercentage(Double bufferPercentage) {
        this.bufferPercentage = bufferPercentage;
    }

    public Integer getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Integer minimumValue) {
        this.minimumValue = minimumValue;
    }

    public Integer getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Integer maximumValue) {
        this.maximumValue = maximumValue;
    }

    public Integer getAdjustmentValue() {
        return adjustmentValue;
    }

    public void setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
    }

    public Long getPopulationSource() {
        return populationSource;
    }

    public void setPopulationSource(Long populationSource) {
        this.populationSource = populationSource;
    }

    public Integer calculate(Long population) {
        int isaValue = (int) Math.ceil(population * (this.whoRatio / ONE_HUNDRED) * this.dosesPerYear *
                this.wastageFactor / MONTHS_IN_YEAR * (1 + this.bufferPercentage / ONE_HUNDRED) + this.adjustmentValue);

        if (this.minimumValue != null && isaValue < this.minimumValue) {
            return this.minimumValue;
        }
        if (this.maximumValue != null && isaValue > this.maximumValue) {
            return this.maximumValue;
        }

        return isaValue;
    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        IdealStockAmount that = (IdealStockAmount) o;

        if (whoRatio != null ? !whoRatio.equals(that.whoRatio) : that.whoRatio != null) {
            return false;
        }
        if (dosesPerYear != null ? !dosesPerYear.equals(that.dosesPerYear) : that.dosesPerYear != null) {
            return false;
        }
        if (wastageFactor != null ? !wastageFactor.equals(that.wastageFactor) : that.wastageFactor != null) {
            return false;
        }
        if (bufferPercentage != null ? !bufferPercentage.equals(that.bufferPercentage) : that.bufferPercentage != null) {
            return false;
        }
        if (minimumValue != null ? !minimumValue.equals(that.minimumValue) : that.minimumValue != null) {
            return false;
        }
        if (maximumValue != null ? !maximumValue.equals(that.maximumValue) : that.maximumValue != null) {
            return false;
        }
        if (adjustmentValue != null ? !adjustmentValue.equals(that.adjustmentValue) : that.adjustmentValue != null) {
            return false;
        }
        return !(populationSource != null ? !populationSource.equals(that.populationSource) : that.populationSource != null);

    }

    @Override
    public int hashCode() {
        int result = whoRatio != null ? whoRatio.hashCode() : 0;
        result = 31 * result + (dosesPerYear != null ? dosesPerYear.hashCode() : 0);
        result = 31 * result + (wastageFactor != null ? wastageFactor.hashCode() : 0);
        result = 31 * result + (bufferPercentage != null ? bufferPercentage.hashCode() : 0);
        result = 31 * result + (minimumValue != null ? minimumValue.hashCode() : 0);
        result = 31 * result + (maximumValue != null ? maximumValue.hashCode() : 0);
        result = 31 * result + (adjustmentValue != null ? adjustmentValue.hashCode() : 0);
        result = 31 * result + (populationSource != null ? populationSource.hashCode() : 0);
        return result;
    }
}
