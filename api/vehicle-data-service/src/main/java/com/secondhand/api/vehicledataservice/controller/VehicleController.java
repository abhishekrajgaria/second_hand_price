package com.secondhand.api.vehicledataservice.controller;

import com.secondhand.api.vehicledataservice.model.VehicleMetaData;
import com.secondhand.api.vehicledataservice.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    
    @Autowired
    VehicleService vehicleService;

    @GetMapping("/vehiclesMetaData/{page}")
    public ResponseEntity<Page<VehicleMetaData>> getVehiclesMetaDataWithPage(@PathVariable Integer page){
        log.info("Get the vehicles Meta data for page: {}", page);
        Page<VehicleMetaData> response = vehicleService.getVehiclesMetaWithPagination(page);
        return ResponseEntity.ok(response);
    }
}
