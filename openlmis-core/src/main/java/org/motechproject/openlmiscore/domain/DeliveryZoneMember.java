package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

@Entity
public class DeliveryZoneMember {

    @Field
    private DeliveryZone deliveryZone;

    @Field
    private Facility facility;

    public DeliveryZoneMember(DeliveryZone deliveryZone, Facility facility) {
        this.deliveryZone = deliveryZone;
        this.facility = facility;
    }

    public DeliveryZone getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(DeliveryZone deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DeliveryZoneMember that = (DeliveryZoneMember) o;

        if (!deliveryZone.equals(that.deliveryZone)) {
            return false;
        }
        return facility.equals(that.facility);

    }

    @Override
    public int hashCode() {
        int result = deliveryZone.hashCode();
        result = 31 * result + facility.hashCode();
        return result;
    }
}
