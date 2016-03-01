package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

import javax.validation.constraints.NotNull;

@Entity
public class Program {

    @Field
    @NotNull
    private Long programId;

    @Field
    @NotNull
    private String code;

    @Field
    @NotNull
    private String name;

    @Field
    private String description;

    @Field
    @NotNull
    private Boolean active = true;

    @Field
    private Boolean budgetingApplies = false;

    @Field
    private Boolean templateConfigured;

    @Field
    private Boolean regimenTemplateConfigured;

    @Field
    @NotNull
    private Boolean push;

    @Field
    private Boolean isEquipmentConfigured;

    @Field
    private Boolean enableSkipPeriod = false;

    @Field
    private Boolean showNonFullSupplyTab = true;

    @Field
    private Boolean hideSkippedProducts = false;

    @Field
    private Boolean enableIvdForm = false;

    @Field
    private Boolean usePriceSchedule = false;

    public Program(Long id) {
        this.programId = id;
    }

    private Program(Long id, String name, String code) {
        this.programId = id;
        this.code = code;
        this.name = name;
    }

    public Program(Long id, String code, String name, String description, Boolean active, boolean templateConfigured) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.active = active;
        this.templateConfigured = templateConfigured;
        this.programId = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean isBudgetingApplies() {
        return budgetingApplies;
    }

    public void setBudgetingApplies(Boolean budgetingApplies) {
        this.budgetingApplies = budgetingApplies;
    }

    public Boolean isTemplateConfigured() {
        return templateConfigured;
    }

    public void setTemplateConfigured(Boolean templateConfigured) {
        this.templateConfigured = templateConfigured;
    }

    public Boolean isRegimenTemplateConfigured() {
        return regimenTemplateConfigured;
    }

    public void setRegimenTemplateConfigured(Boolean regimenTemplateConfigured) {
        this.regimenTemplateConfigured = regimenTemplateConfigured;
    }

    public Boolean isPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public Boolean isEquipmentConfigured() {
        return isEquipmentConfigured;
    }

    public void setIsEquipmentConfigured(Boolean isEquipmentConfigured) {
        this.isEquipmentConfigured = isEquipmentConfigured;
    }

    public Boolean isEnableSkipPeriod() {
        return enableSkipPeriod;
    }

    public void setEnableSkipPeriod(Boolean enableSkipPeriod) {
        this.enableSkipPeriod = enableSkipPeriod;
    }

    public Boolean isShowNonFullSupplyTab() {
        return showNonFullSupplyTab;
    }

    public void setShowNonFullSupplyTab(Boolean showNonFullSupplyTab) {
        this.showNonFullSupplyTab = showNonFullSupplyTab;
    }

    public Boolean isHideSkippedProducts() {
        return hideSkippedProducts;
    }

    public void setHideSkippedProducts(Boolean hideSkippedProducts) {
        this.hideSkippedProducts = hideSkippedProducts;
    }

    public Boolean isEnableIvdForm() {
        return enableIvdForm;
    }

    public void setEnableIvdForm(Boolean enableIvdForm) {
        this.enableIvdForm = enableIvdForm;
    }

    public Boolean isUsePriceSchedule() {
        return usePriceSchedule;
    }

    public void setUsePriceSchedule(Boolean usePriceSchedule) {
        this.usePriceSchedule = usePriceSchedule;
    }

    public Program basicInformation() {
        Program program = new Program(programId, name, code);
        program.setBudgetingApplies(budgetingApplies);
        return program;
    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Program program = (Program) o;

        if (!programId.equals(program.programId)) {
            return false;
        }
        if (!code.equals(program.code)) {
            return false;
        }
        if (!name.equals(program.name)) {
            return false;
        }
        if (description != null ? !description.equals(program.description) : program.description != null) {
            return false;
        }
        if (!active.equals(program.active)) {
            return false;
        }
        if (budgetingApplies != null ? !budgetingApplies.equals(program.budgetingApplies) : program.budgetingApplies != null) {
            return false;
        }
        if (templateConfigured != null ? !templateConfigured.equals(program.templateConfigured) : program.templateConfigured != null) {
            return false;
        }
        if (regimenTemplateConfigured != null ? !regimenTemplateConfigured.equals(program.regimenTemplateConfigured) : program.regimenTemplateConfigured != null) {
            return false;
        }
        if (!push.equals(program.push)) {
            return false;
        }
        if (isEquipmentConfigured != null ? !isEquipmentConfigured.equals(program.isEquipmentConfigured) : program.isEquipmentConfigured != null) {
            return false;
        }
        if (enableSkipPeriod != null ? !enableSkipPeriod.equals(program.enableSkipPeriod) : program.enableSkipPeriod != null) {
            return false;
        }
        if (showNonFullSupplyTab != null ? !showNonFullSupplyTab.equals(program.showNonFullSupplyTab) : program.showNonFullSupplyTab != null) {
            return false;
        }
        if (hideSkippedProducts != null ? !hideSkippedProducts.equals(program.hideSkippedProducts) : program.hideSkippedProducts != null) {
            return false;
        }
        if (enableIvdForm != null ? !enableIvdForm.equals(program.enableIvdForm) : program.enableIvdForm != null) {
            return false;
        }
        return !(usePriceSchedule != null ? !usePriceSchedule.equals(program.usePriceSchedule) : program.usePriceSchedule != null);

    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public int hashCode() {
        int result = programId.hashCode();
        result = 31 * result + code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + active.hashCode();
        result = 31 * result + (budgetingApplies != null ? budgetingApplies.hashCode() : 0);
        result = 31 * result + (templateConfigured != null ? templateConfigured.hashCode() : 0);
        result = 31 * result + (regimenTemplateConfigured != null ? regimenTemplateConfigured.hashCode() : 0);
        result = 31 * result + push.hashCode();
        result = 31 * result + (isEquipmentConfigured != null ? isEquipmentConfigured.hashCode() : 0);
        result = 31 * result + (enableSkipPeriod != null ? enableSkipPeriod.hashCode() : 0);
        result = 31 * result + (showNonFullSupplyTab != null ? showNonFullSupplyTab.hashCode() : 0);
        result = 31 * result + (hideSkippedProducts != null ? hideSkippedProducts.hashCode() : 0);
        result = 31 * result + (enableIvdForm != null ? enableIvdForm.hashCode() : 0);
        result = 31 * result + (usePriceSchedule != null ? usePriceSchedule.hashCode() : 0);
        return result;
    }
}
