package com.secondhand.api.vehicledataservice.service;

import com.secondhand.api.vehicledataservice.model.VehicleMetaData;

import org.springframework.data.domain.Page;

public interface VehicleService {
    public Page<VehicleMetaData> getVehiclesMetaWithPagination(Integer page);
}
