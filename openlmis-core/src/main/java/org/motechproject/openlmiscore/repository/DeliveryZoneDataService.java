package org.motechproject.openlmiscore.repository;

import org.motechproject.mds.annotations.Lookup;
import org.motechproject.mds.annotations.LookupField;
import org.motechproject.mds.service.MotechDataService;
import org.motechproject.openlmiscore.domain.DeliveryZone;

public interface DeliveryZoneDataService extends MotechDataService<DeliveryZone> {

    @Lookup
    DeliveryZone findByCode(@LookupField(name = "code") String code);

}
