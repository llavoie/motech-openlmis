package org.motechproject.openlmiscore.repository;

import org.motechproject.mds.service.MotechDataService;
import org.motechproject.mds.annotations.Lookup;
import org.motechproject.mds.annotations.LookupField;
import org.motechproject.openlmiscore.domain.Product;

public interface ProductDataService extends MotechDataService<Product> {

    @Lookup Product findByCode(@LookupField(name = "code") String code);

}
