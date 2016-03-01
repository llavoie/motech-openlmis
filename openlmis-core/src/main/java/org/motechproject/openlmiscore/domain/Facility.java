package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.mds.annotations.Ignore;
import org.motechproject.mds.domain.MdsEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Field
    private String gln;

    @Field
    private String mainPhone;

    @Field
    private String fax;

    @Field
    private String address1;

    @Field
    private String address2;

    @Field
    private GeographicZone geographicZone;

    @Field
    private FacilityType facilityType;

    @Field
    private Long catchmentPopulation;

    @Field
    private Double latitude;

    @Field
    private Double longitude;

    @Field
    private Double altitude;

    @Field
    private FacilityOperator operatedBy;

    @Field
    private Double coldStorageGrossCapacity;

    @Field
    private Double coldStorageNetCapacity;

    @Field
    private Boolean suppliesOthers;

    @Field
    private Boolean sdp;

    @Field
    private Boolean hasElectricity;

    @Field
    private Boolean online;

    @Field
    private Boolean hasElectronicSCC;

    @Field
    private Boolean hasElectronicDAR;

    @Field
    private Boolean active;

    @Field
    private Date goLiveDate;

    @Field
    private Date goDownDate;

    @Field
    private Boolean satellite;

    @Field
    private Long parentFacilityId;

    @Field
    private String comment;

    @Field
    private Boolean enabled;

    @Field
    private Boolean virtualFacility = false;

    //TODO: I left out interfaceMappings for now -- what is it for?

    @Field
    private List<ProgramSupported> programsSupported = new ArrayList<>();

    public Facility(Long id) {
        this.facilityId = id;
    }

    public Facility(Long id, String code, String name, FacilityOperator operatedBy, GeographicZone geographicZone, FacilityType facilityType, boolean virtualFacility) {
        this.facilityId = id;
        this.code = code;
        this.name = name;
        this.operatedBy = operatedBy;
        this.geographicZone = geographicZone;
        this.facilityType = facilityType;
        this.virtualFacility = virtualFacility;
    }

    public Facility(Long id, boolean enabled, boolean active, Long modifiedBy) {
        this.facilityId = id;
        this.enabled = enabled;
        this.active = active;
        // TODO: why is modifiedBy a Long? Is it a user ID?
        this.setModifiedBy(modifiedBy.toString());
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

    public String getGln() {
        return gln;
    }

    public void setGln(String gln) {
        this.gln = gln;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public GeographicZone getGeographicZone() {
        return geographicZone;
    }

    public void setGeographicZone(GeographicZone geographicZone) {
        this.geographicZone = geographicZone;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
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

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public FacilityOperator getOperatedBy() {
        return operatedBy;
    }

    public void setOperatedBy(FacilityOperator operatedBy) {
        this.operatedBy = operatedBy;
    }

    public Double getColdStorageGrossCapacity() {
        return coldStorageGrossCapacity;
    }

    public void setColdStorageGrossCapacity(Double coldStorageGrossCapacity) {
        this.coldStorageGrossCapacity = coldStorageGrossCapacity;
    }

    public Double getColdStorageNetCapacity() {
        return coldStorageNetCapacity;
    }

    public void setColdStorageNetCapacity(Double coldStorageNetCapacity) {
        this.coldStorageNetCapacity = coldStorageNetCapacity;
    }

    public Boolean isSuppliesOthers() {
        return suppliesOthers;
    }

    public void setSuppliesOthers(Boolean suppliesOthers) {
        this.suppliesOthers = suppliesOthers;
    }

    public Boolean isSdp() {
        return sdp;
    }

    public void setSdp(Boolean sdp) {
        this.sdp = sdp;
    }

    public Boolean isHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(Boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public Boolean isOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Boolean isHasElectronicSCC() {
        return hasElectronicSCC;
    }

    public void setHasElectronicSCC(Boolean hasElectronicSCC) {
        this.hasElectronicSCC = hasElectronicSCC;
    }

    public Boolean isHasElectronicDAR() {
        return hasElectronicDAR;
    }

    public void setHasElectronicDAR(Boolean hasElectronicDAR) {
        this.hasElectronicDAR = hasElectronicDAR;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getGoLiveDate() {
        return goLiveDate;
    }

    public void setGoLiveDate(Date goLiveDate) {
        this.goLiveDate = goLiveDate;
    }

    public Date getGoDownDate() {
        return goDownDate;
    }

    public void setGoDownDate(Date goDownDate) {
        this.goDownDate = goDownDate;
    }

    public Boolean isSatellite() {
        return satellite;
    }

    public void setSatellite(Boolean satellite) {
        this.satellite = satellite;
    }

    public Long getParentFacilityId() {
        return parentFacilityId;
    }

    public void setParentFacilityId(Long parentFacilityId) {
        this.parentFacilityId = parentFacilityId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean isVirtualFacility() {
        return virtualFacility;
    }

    public void setVirtualFacility(Boolean virtualFacility) {
        this.virtualFacility = virtualFacility;
    }

    public List<ProgramSupported> getProgramsSupported() {
        return programsSupported;
    }

    public void setProgramsSupported(List<ProgramSupported> programsSupported) {
        this.programsSupported = programsSupported;
    }

    // TODO: equals and hashCode had interesting implementations in the OpenLMIS source. Find out why. For now I've
    // implemented them in a more standard way.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Facility facility = (Facility) o;

        if (!code.equals(facility.code)) {
            return false;
        }
        if (!name.equals(facility.name)) {
            return false;
        }
        if (!facilityId.equals(facility.facilityId)) {
            return false;
        }
        if (geographicZone != null ? !geographicZone.equals(facility.geographicZone) : facility.geographicZone != null) {
            return false;
        }
        return !(programsSupported != null ? !programsSupported.equals(facility.programsSupported) :
                facility.programsSupported != null);

    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + facilityId.hashCode();
        result = 31 * result + (geographicZone != null ? geographicZone.hashCode() : 0);
        result = 31 * result + (programsSupported != null ? programsSupported.hashCode() : 0);
        return result;
    }

    public Facility basicInformation() {
        return new Facility(facilityId, code, name, operatedBy, geographicZone, facilityType, virtualFacility);
    }

    public static Facility createFacilityToBeDeleted(Long facilityId, Long modifiedBy) {
        return new Facility(facilityId, false, false, modifiedBy);
    }

    public static Facility createFacilityToBeRestored(Long facilityId, Long modifiedBy) {
        return new Facility(facilityId, true, false, modifiedBy);
    }

    public void validate() {
        for (ProgramSupported programSupported : programsSupported) {
            programSupported.isValid();
        }
    }

    public boolean isValid(Facility parentFacility) {
        if (parentFacility == null) {
            return active && enabled;
        }

        return active && enabled && parentFacility.active && parentFacility.enabled;
    }

    @SuppressWarnings("unused")
    @Ignore
    public String getStringGoLiveDate() throws ParseException {
        return this.goLiveDate == null ? null : new SimpleDateFormat("dd-MM-yyyy").format(this.goLiveDate);
    }

    @SuppressWarnings("unused")
    @Ignore
    public String getStringGoDownDate() throws ParseException {
        return this.goDownDate == null ? null : new SimpleDateFormat("dd-MM-yyyy").format(this.goDownDate);
    }

    @Ignore
    public Double getWhoRatioFor(String productCode) {
        return this.getProgramsSupported().get(0).getWhoRatioFor(productCode);
    }

    public static List<Facility> filterForActiveProducts(List<Facility> facilities) {
        for (Facility facility : facilities) {
            for (ProgramSupported programSupported : facility.getProgramsSupported()) {
                programSupported.setProgramProducts(FacilityProgramProduct.filterActiveProducts(programSupported.getProgramProducts()));
            }
        }
        return facilities;
    }

    @Ignore
    public Integer getPackSizeFor(String productCode) {
        return this.getProgramsSupported().get(0).getPackSizeFor(productCode);
    }

}
