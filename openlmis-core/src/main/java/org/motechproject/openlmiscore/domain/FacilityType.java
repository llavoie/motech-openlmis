package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

import javax.validation.constraints.NotNull;

@Entity
public class FacilityType {

    @Field
    @NotNull
    private String code;

    @Field
    @NotNull
    private String name;

    @Field
    private String description;

    @Field
    private Integer levelId;

    @Field
    @NotNull
    private Integer nominalMaxMonth;

    @Field
    @NotNull
    private Double nominalEop;

    @Field
    @NotNull
    private Integer displayOrder;

    @Field
    @NotNull
    private Boolean active;

    public FacilityType() {
    }

    public FacilityType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getNominalMaxMonth() {
        return nominalMaxMonth;
    }

    public void setNominalMaxMonth(Integer nominalMaxMonth) {
        this.nominalMaxMonth = nominalMaxMonth;
    }

    public Double getNominalEop() {
        return nominalEop;
    }

    public void setNominalEop(Double nominalEop) {
        this.nominalEop = nominalEop;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FacilityType that = (FacilityType) o;

        if (active != that.active) {
            return false;
        }
        if (!code.equals(that.code)) {
            return false;
        }
        if (!name.equals(that.name)) {
            return false;
        }
        if (description != null ? !description.equals(that.description) : that.description != null) {
            return false;
        }
        if (levelId != null ? !levelId.equals(that.levelId) : that.levelId != null) {
            return false;
        }
        if (!nominalMaxMonth.equals(that.nominalMaxMonth)) {
            return false;
        }
        if (!nominalEop.equals(that.nominalEop)) {
            return false;
        }
        return displayOrder.equals(that.displayOrder);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (levelId != null ? levelId.hashCode() : 0);
        result = 31 * result + nominalMaxMonth.hashCode();
        result = 31 * result + nominalEop.hashCode();
        result = 31 * result + displayOrder.hashCode();
        result = 31 * result + (active ? 1 : 0);
        return result;
    }
}
