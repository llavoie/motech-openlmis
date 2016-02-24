package org.motechproject.openlmiscore.domain;

import org.motechproject.openlmiscore.exception.DataException;
import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

@Entity
public class ProductForm {

    @Field
    private String code;

    @Field
    private Integer displayOrder;

    public ProductForm(String code, Integer displayOrder) {
        this.code = code;
        this.displayOrder = displayOrder;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * Validates this product form.
     * @throws DataException if this object is not well-formed.
     */
    public void isValid() {
        if (code == null
                || code.length() == 0
                || displayOrder == null) {
            throw new DataException("error.reference.data.missing");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProductForm that = (ProductForm) o;

        if (!code.equals(that.code)) {
            return false;
        }
        return displayOrder.equals(that.displayOrder);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + displayOrder.hashCode();
        return result;
    }
}
