package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Field;

import javax.validation.constraints.NotNull;

public class ProductCategory {

    @Field
    @NotNull
    private String code;

    @Field
    @NotNull
    private String name;

    @Field
    @NotNull
    private Integer displayOrder;

    public ProductCategory(String code, String name, Integer displayOrder) {
        this.code = code;
        this.name = name;
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

        ProductCategory that = (ProductCategory) o;

        if (!code.equals(that.code)) {
            return false;
        }
        if (!name.equals(that.name)) {
            return false;
        }
        return displayOrder.equals(that.displayOrder);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + displayOrder.hashCode();
        return result;
    }
}
