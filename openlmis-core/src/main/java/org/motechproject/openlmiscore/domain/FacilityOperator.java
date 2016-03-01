package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

import javax.validation.constraints.NotNull;

@Entity
public class FacilityOperator {

    @Field
    @NotNull
    private String code;

    @Field
    @NotNull
    private String text;

    @Field
    @NotNull
    private Integer displayOrder;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FacilityOperator that = (FacilityOperator) o;

        if (!code.equals(that.code)) {
            return false;
        }
        if (!text.equals(that.text)) {
            return false;
        }
        return displayOrder.equals(that.displayOrder);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + text.hashCode();
        result = 31 * result + displayOrder.hashCode();
        return result;
    }
}
