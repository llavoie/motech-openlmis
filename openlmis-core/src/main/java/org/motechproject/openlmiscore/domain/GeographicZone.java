package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.openlmiscore.exception.DataException;

import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

@Entity
public class GeographicZone {

    @Field
    @NotNull
    private String code;

    @Field
    @NotNull
    private String name;

    @Field
    private GeographicZone parent;

    @Field
    private Long catchmentPopulation;

    @Field
    private Double latitude;

    @Field
    private Double longitude;

    public GeographicZone(String code, String name, GeographicZone parent) {
        this.code = code;
        this.name = name;
        this.parent = parent;
    }

    public GeographicZone(String code, String name, GeographicZone parent, Long catchmentPopulation, Double latitude, Double longitude) {
        this.code = code;
        this.name = name;
        this.parent = parent;
        this.catchmentPopulation = catchmentPopulation;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public GeographicZone getParent() {
        return parent;
    }

    public void setParent(GeographicZone parent) {
        this.parent = parent;
    }

    public Long getCatchmentPopulation() {
        return catchmentPopulation;
    }

    public void setCatchmentPopulation(Long catchmentPopulation) {
        this.catchmentPopulation = catchmentPopulation;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


    public void validateParentExists() {
        if (parent == null) {
            throw new DataException("error.geo.zone.parent.invalid");
        }
    }

    public void validateMandatoryFields() {
        if (StringUtils.isBlank(this.code) || StringUtils.isBlank(this.name)) {
            throw new DataException("error.mandatory.fields.missing");
        }
    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GeographicZone that = (GeographicZone) o;

        if (!code.equals(that.code)) {
            return false;
        }
        if (!name.equals(that.name)) {
            return false;
        }
        if (parent != null ? !parent.equals(that.parent) : that.parent != null) {
            return false;
        }
        if (catchmentPopulation != null ? !catchmentPopulation.equals(that.catchmentPopulation) : that.catchmentPopulation != null) {
            return false;
        }
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) {
            return false;
        }
        return !(longitude != null ? !longitude.equals(that.longitude) : that.longitude != null);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (catchmentPopulation != null ? catchmentPopulation.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        return result;
    }

    //TODO: add back GeographicLevel
}
