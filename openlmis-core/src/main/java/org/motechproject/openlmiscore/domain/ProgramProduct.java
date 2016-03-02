package org.motechproject.openlmiscore.domain;

import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;
import org.motechproject.openlmiscore.exception.DataException;

import javax.validation.constraints.NotNull;

@Entity
public class ProgramProduct {

    @Field
    @NotNull
    private Program program;

    @Field
    @NotNull
    private Product product;

    @Field
    @NotNull
    private Integer dosesPerMonth;

    @Field
    @NotNull
    private Boolean active;

    @Field
    @NotNull
    private ProductCategory productCategory;

    @Field
    private Long productCategoryId;

    @Field
    @NotNull
    private boolean fullSupply;

    @Field
    private Integer displayOrder;

    @Field
    private ProgramProductIdealStockAmount programProductIdealStockAmount;

    @Field
    private Double currentPrice;

    public ProgramProduct(Program program, Product product, Integer dosesPerMonth, Boolean active) {
        this.program = program;
        this.product = product;
        this.dosesPerMonth = dosesPerMonth;
        this.active = active;
    }

    public ProgramProduct(Program program, Product product, Integer dosesPerMonth, Boolean active, Double currentPrice) {
        this.program = program;
        this.product = product;
        this.dosesPerMonth = dosesPerMonth;
        this.active = active;
        this.currentPrice = currentPrice;
    }

    public ProgramProduct(ProgramProduct programProduct) {
        this.program = programProduct.program;
        this.product = programProduct.product;
        this.dosesPerMonth = programProduct.dosesPerMonth;
        this.active = programProduct.active;
        this.currentPrice = programProduct.currentPrice;
        this.programProductIdealStockAmount = programProduct.programProductIdealStockAmount;
        this.displayOrder = programProduct.displayOrder;
        this.fullSupply = programProduct.fullSupply;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getDosesPerMonth() {
        return dosesPerMonth;
    }

    public void setDosesPerMonth(Integer dosesPerMonth) {
        this.dosesPerMonth = dosesPerMonth;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public boolean isFullSupply() {
        return fullSupply;
    }

    public void setFullSupply(boolean fullSupply) {
        this.fullSupply = fullSupply;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public ProgramProductIdealStockAmount getProgramProductIdealStockAmount() {
        return programProductIdealStockAmount;
    }

    public void setProgramProductIdealStockAmount(ProgramProductIdealStockAmount programProductIdealStockAmount) {
        this.programProductIdealStockAmount = programProductIdealStockAmount;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void validate() {
        if (currentPrice < 0) {
            throw new DataException("programProduct.invalid.current.price");
        }
    }

    @Override // NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProgramProduct that = (ProgramProduct) o;

        if (fullSupply != that.fullSupply) {
            return false;
        }
        if (!program.equals(that.program)) {
            return false;
        }
        if (!product.equals(that.product)) {
            return false;
        }
        if (!dosesPerMonth.equals(that.dosesPerMonth)) {
            return false;
        }
        if (!active.equals(that.active)) {
            return false;
        }
        if (!productCategory.equals(that.productCategory)) {
            return false;
        }
        if (productCategoryId != null ? !productCategoryId.equals(that.productCategoryId) : that.productCategoryId != null) {
            return false;
        }
        if (displayOrder != null ? !displayOrder.equals(that.displayOrder) : that.displayOrder != null) {
            return false;
        }
        if (programProductIdealStockAmount != null ? !programProductIdealStockAmount.equals(that.programProductIdealStockAmount) : that.programProductIdealStockAmount != null) {
            return false;
        }
        return !(currentPrice != null ? !currentPrice.equals(that.currentPrice) : that.currentPrice != null);

    }

    @Override
    public int hashCode() {
        int result = program.hashCode();
        result = 31 * result + product.hashCode();
        result = 31 * result + dosesPerMonth.hashCode();
        result = 31 * result + active.hashCode();
        result = 31 * result + productCategory.hashCode();
        result = 31 * result + (productCategoryId != null ? productCategoryId.hashCode() : 0);
        result = 31 * result + (fullSupply ? 1 : 0);
        result = 31 * result + (displayOrder != null ? displayOrder.hashCode() : 0);
        result = 31 * result + (programProductIdealStockAmount != null ? programProductIdealStockAmount.hashCode() : 0);
        result = 31 * result + (currentPrice != null ? currentPrice.hashCode() : 0);
        return result;
    }
}
