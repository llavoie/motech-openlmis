package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.openlmiscore.exception.DataException;

@Entity
public class DosageUnit {

    @Field
    private String code;

    @Field
    private int displayOrder;

    public DosageUnit(String code, int displayOrder) {
        this.code = code;
        this.displayOrder = displayOrder;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * Validation method for an instantiated DosageUnit.  A valid dosage unit has a code and a display order.
     *
     * @throws DataException if this dosage unit is not defined well.
     */
    public void isValid() {
        if (code == null
                || code.length() == 0
                || displayOrder <= 0) {
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

        DosageUnit that = (DosageUnit) o;

        if (displayOrder != that.displayOrder) {
            return false;
        }
        return code.equals(that.code);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + displayOrder;
        return result;
    }
}


