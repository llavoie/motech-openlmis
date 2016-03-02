package org.motechproject.openlmiscore.service;

import org.motechproject.openlmiscore.domain.DosageUnit;
import org.motechproject.openlmiscore.domain.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);

    Long getIdForCode(String code);

    Product getByCode(String code);

    boolean isActive(String code);

    Integer getTotalSearchResultCount(String searchParam);

    List<DosageUnit> getAllDosageUnits();

    Product getById(Long id);
}
