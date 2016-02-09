package com.invoax.partfinder.storeservice.repository;

import com.invoax.partfinder.storeservice.model.StoreConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hate_configs", path = "hate_configs")
public interface StoreConfigRepository extends MongoRepository<StoreConfig, String> {

}