package org.motechproject.openlmiscore.service.impl;

import org.motechproject.openlmiscore.domain.DeliveryZone;
import org.motechproject.openlmiscore.repository.DeliveryZoneDataService;
import org.motechproject.openlmiscore.service.DeliveryZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deliveryZoneService")
public class DeliveryZoneServiceImpl implements DeliveryZoneService {

    private DeliveryZoneDataService deliveryZoneDataService;

    @Autowired
    public DeliveryZoneServiceImpl(DeliveryZoneDataService deliveryZoneDataService) {
        this.deliveryZoneDataService = deliveryZoneDataService;
    }

    @Override
    public void save(DeliveryZone zone) {
        this.deliveryZoneDataService.createOrUpdate(zone);
    }

    @Override
    public DeliveryZone getByCode(String code) {
        return deliveryZoneDataService.findByCode(code);
    }

    @Override
    public DeliveryZone getById(Long id) {
        return deliveryZoneDataService.findById(id);
    }

    @Override
    public List<DeliveryZone> getAll() {
        return deliveryZoneDataService.retrieveAll();
    }

}
