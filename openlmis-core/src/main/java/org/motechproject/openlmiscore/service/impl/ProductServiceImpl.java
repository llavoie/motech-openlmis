package org.motechproject.openlmiscore.service.impl;

import org.motechproject.openlmiscore.domain.DosageUnit;
import org.motechproject.openlmiscore.domain.Product;
import org.motechproject.openlmiscore.repository.ProductDataService;
import org.motechproject.openlmiscore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    private ProductDataService productDataService;

    @Autowired
    public ProductServiceImpl(ProductDataService productDataService) {
        this.productDataService = productDataService;
    }

    @Override
    public void save(Product product) {
        product.validate();
        productDataService.create(product);
    }

    @Override
    public Long getIdForCode(String code) {
        Product product = productDataService.findByCode(code);
        if (product == null) {
            return null;
        }
        return (Long) productDataService.getDetachedField(product, "id");
    }

    @Override
    public Product getByCode(String code) {
        return new Product();
    }

    @Override
    public boolean isActive(String code) {
        Product product = productDataService.findByCode(code);
        if (product == null) {
            return false;
        }
        return product.getActive();
    }

    @Override
    public Integer getTotalSearchResultCount(String searchParam) {
        return 0;
    }

    @Override
    public List<DosageUnit> getAllDosageUnits() {
        return null;
    }

    @Override
    public Product getById(Long id) {
        return productDataService.findById(id);
    }
}
