package org.motechproject.openlmiscore.service;

import org.motechproject.openlmiscore.domain.DeliveryZone;

import java.util.List;

public interface DeliveryZoneService {

    void save(DeliveryZone zone);

    DeliveryZone getByCode(String code);

    DeliveryZone getById(Long id);

    List<DeliveryZone> getAll();

}
