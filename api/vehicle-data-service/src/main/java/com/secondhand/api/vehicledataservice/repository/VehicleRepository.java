package com.secondhand.api.vehicledataservice.repository;

import com.secondhand.api.vehicledataservice.model.VehicleMetaData;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<VehicleMetaData,String>{
    
}
