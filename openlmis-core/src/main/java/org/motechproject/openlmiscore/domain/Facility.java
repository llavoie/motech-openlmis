package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.mds.domain.MdsEntity;


@Entity
public class Facility extends MdsEntity {

    @Field
    private String code;

    @Field
    private String name;

    @Field
    private Long facilityId;

    @Field
    private String description;

    public Facility(String code, String name, Long facilityId, String description) {
        this.code = code;
        this.name = name;
        this.facilityId = facilityId;
        this.description = description;
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

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Facility facility = (Facility) o;

        if (code != null ? !code.equals(facility.code) : facility.code != null) {
            return false;
        }
        if (name != null ? !name.equals(facility.name) : facility.name != null) {
            return false;
        }
        if (facilityId != null ? !facilityId.equals(facility.facilityId) : facility.facilityId != null) {
            return false;
        }
        return !(description != null ? !description.equals(facility.description) : facility.description != null);

    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (facilityId != null ? facilityId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
