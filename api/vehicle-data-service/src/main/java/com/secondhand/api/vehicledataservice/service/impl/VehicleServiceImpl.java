package com.secondhand.api.vehicledataservice.service.impl;

import com.secondhand.api.vehicledataservice.model.VehicleMetaData;
import com.secondhand.api.vehicledataservice.repository.VehicleRepository;
import com.secondhand.api.vehicledataservice.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Page<VehicleMetaData> getVehiclesMetaWithPagination(Integer page) {
        PageRequest pageRequest = PageRequest.of(page-1, 10);
        log.info("Getting VehiclesMetaData list for page {}",page);
        return vehicleRepository.findAll(pageRequest);
    }
    
}
