package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.openlmiscore.exception.DataException;

@Entity
public class Product {

    @Field
    private String code;

    @Field
    private String alternateItemCode;

    private String manufacturer;

    private String manufacturerCode;

    private String manufacturerBarCode;

    private String mohBarCode;

    private String gtin;

    private String type;

    private String primaryName;

    private String fullName;

    private String genericName;

    private String alternateName;

    private String description;

    private String strength;

    private ProductForm form;

    private Long formId;

    private ProductGroup productGroup;

    private Long productGroupId;

    private DosageUnit dosageUnit;

    private Long dosageUnitId;

    private String dispensingUnit;

    private Integer dosesPerDispensingUnit;

    private Boolean storeRefrigerated;

    private Boolean storeRoomTemperature;

    private Boolean hazardous;

    private Boolean flammable;

    private Boolean controlledSubstance;

    private Boolean lightSensitive;

    private Boolean approvedByWHO;

    private Double contraceptiveCYP;

    private Integer packSize;

    private Integer alternatePackSize;

    private Double packLength;

    private Double packWidth;

    private Double packHeight;

    private Double packWeight;

    private Integer packsPerCarton;

    private Double cartonLength;

    private Double cartonWidth;

    private Double cartonHeight;

    private Integer cartonsPerPallet;

    private Integer expectedShelfLife;

    private String specialStorageInstructions;

    private String specialTransportInstructions;

    private Boolean active;

    private Boolean fullSupply;

    private Boolean tracer;

    private Integer packRoundingThreshold;

    private Boolean roundToZero;

    private Boolean archived;

    public void validate() {
        if (this.packSize <= 0) {
            throw new DataException("error.invalid.pack.size");
        }
    }

    public String getName() {
        return (getPrimaryName() == null ? "" : getPrimaryName())
                + " " + (getForm() == null || getForm().getCode() == null ? "" : getForm().getCode())
                + " " + (getStrength() == null ? "" : getStrength())
                + " " + (getDosageUnit() == null || getDosageUnit().getCode() == null ? "" : getDosageUnit().getCode());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAlternateItemCode() {
        return alternateItemCode;
    }

    public void setAlternateItemCode(String alternateItemCode) {
        this.alternateItemCode = alternateItemCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getManufacturerBarCode() {
        return manufacturerBarCode;
    }

    public void setManufacturerBarCode(String manufacturerBarCode) {
        this.manufacturerBarCode = manufacturerBarCode;
    }

    public String getMohBarCode() {
        return mohBarCode;
    }

    public void setMohBarCode(String mohBarCode) {
        this.mohBarCode = mohBarCode;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public ProductForm getForm() {
        return form;
    }

    public void setForm(ProductForm form) {
        this.form = form;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public Long getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(Long productGroupId) {
        this.productGroupId = productGroupId;
    }

    public DosageUnit getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(DosageUnit dosageUnit) {
        this.dosageUnit = dosageUnit;
    }

    public Long getDosageUnitId() {
        return dosageUnitId;
    }

    public void setDosageUnitId(Long dosageUnitId) {
        this.dosageUnitId = dosageUnitId;
    }

    public String getDispensingUnit() {
        return dispensingUnit;
    }

    public void setDispensingUnit(String dispensingUnit) {
        this.dispensingUnit = dispensingUnit;
    }

    public Integer getDosesPerDispensingUnit() {
        return dosesPerDispensingUnit;
    }

    public void setDosesPerDispensingUnit(Integer dosesPerDispensingUnit) {
        this.dosesPerDispensingUnit = dosesPerDispensingUnit;
    }

    public Boolean isStoreRefrigerated() {
        return storeRefrigerated;
    }

    public void setStoreRefrigerated(Boolean storeRefrigerated) {
        this.storeRefrigerated = storeRefrigerated;
    }

    public Boolean isStoreRoomTemperature() {
        return storeRoomTemperature;
    }

    public void setStoreRoomTemperature(Boolean storeRoomTemperature) {
        this.storeRoomTemperature = storeRoomTemperature;
    }

    public Boolean isHazardous() {
        return hazardous;
    }

    public void setHazardous(Boolean hazardous) {
        this.hazardous = hazardous;
    }

    public Boolean isFlammable() {
        return flammable;
    }

    public void setFlammable(Boolean flammable) {
        this.flammable = flammable;
    }

    public Boolean isControlledSubstance() {
        return controlledSubstance;
    }

    public void setControlledSubstance(Boolean controlledSubstance) {
        this.controlledSubstance = controlledSubstance;
    }

    public Boolean isLightSensitive() {
        return lightSensitive;
    }

    public void setLightSensitive(Boolean lightSensitive) {
        this.lightSensitive = lightSensitive;
    }

    public Boolean isApprovedByWHO() {
        return approvedByWHO;
    }

    public void setApprovedByWHO(Boolean approvedByWHO) {
        this.approvedByWHO = approvedByWHO;
    }

    public Double getContraceptiveCYP() {
        return contraceptiveCYP;
    }

    public void setContraceptiveCYP(Double contraceptiveCYP) {
        this.contraceptiveCYP = contraceptiveCYP;
    }

    public Integer getPackSize() {
        return packSize;
    }

    public void setPackSize(Integer packSize) {
        this.packSize = packSize;
    }

    public Integer getAlternatePackSize() {
        return alternatePackSize;
    }

    public void setAlternatePackSize(Integer alternatePackSize) {
        this.alternatePackSize = alternatePackSize;
    }

    public Double getPackLength() {
        return packLength;
    }

    public void setPackLength(Double packLength) {
        this.packLength = packLength;
    }

    public Double getPackWidth() {
        return packWidth;
    }

    public void setPackWidth(Double packWidth) {
        this.packWidth = packWidth;
    }

    public Double getPackHeight() {
        return packHeight;
    }

    public void setPackHeight(Double packHeight) {
        this.packHeight = packHeight;
    }

    public Double getPackWeight() {
        return packWeight;
    }

    public void setPackWeight(Double packWeight) {
        this.packWeight = packWeight;
    }

    public Integer getPacksPerCarton() {
        return packsPerCarton;
    }

    public void setPacksPerCarton(Integer packsPerCarton) {
        this.packsPerCarton = packsPerCarton;
    }

    public Double getCartonLength() {
        return cartonLength;
    }

    public void setCartonLength(Double cartonLength) {
        this.cartonLength = cartonLength;
    }

    public Double getCartonWidth() {
        return cartonWidth;
    }

    public void setCartonWidth(Double cartonWidth) {
        this.cartonWidth = cartonWidth;
    }

    public Double getCartonHeight() {
        return cartonHeight;
    }

    public void setCartonHeight(Double cartonHeight) {
        this.cartonHeight = cartonHeight;
    }

    public Integer getCartonsPerPallet() {
        return cartonsPerPallet;
    }

    public void setCartonsPerPallet(Integer cartonsPerPallet) {
        this.cartonsPerPallet = cartonsPerPallet;
    }

    public Integer getExpectedShelfLife() {
        return expectedShelfLife;
    }

    public void setExpectedShelfLife(Integer expectedShelfLife) {
        this.expectedShelfLife = expectedShelfLife;
    }

    public String getSpecialStorageInstructions() {
        return specialStorageInstructions;
    }

    public void setSpecialStorageInstructions(String specialStorageInstructions) {
        this.specialStorageInstructions = specialStorageInstructions;
    }

    public String getSpecialTransportInstructions() {
        return specialTransportInstructions;
    }

    public void setSpecialTransportInstructions(String specialTransportInstructions) {
        this.specialTransportInstructions = specialTransportInstructions;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean isFullSupply() {
        return fullSupply;
    }

    public void setFullSupply(Boolean fullSupply) {
        this.fullSupply = fullSupply;
    }

    public Boolean isTracer() {
        return tracer;
    }

    public void setTracer(Boolean tracer) {
        this.tracer = tracer;
    }

    public Integer getPackRoundingThreshold() {
        return packRoundingThreshold;
    }

    public void setPackRoundingThreshold(Integer packRoundingThreshold) {
        this.packRoundingThreshold = packRoundingThreshold;
    }

    public Boolean isRoundToZero() {
        return roundToZero;
    }

    public void setRoundToZero(Boolean roundToZero) {
        this.roundToZero = roundToZero;
    }

    public Boolean isArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }
}
