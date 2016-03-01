package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

@Entity
public class DeliveryZone {

    @Field
    private String code;

    @Field
    private String name;

    @Field
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DeliveryZone that = (DeliveryZone) o;

        if (!code.equals(that.code)) {
            return false;
        }
        if (!name.equals(that.name)) {
            return false;
        }
        return !(description != null ? !description.equals(that.description) : that.description != null);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}


