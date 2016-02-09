package com.invoax.partfinder.storeservice.repository;

import java.util.List;
import com.invoax.partfinder.storeservice.model.Store;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hate_stores", path = "hate_stores")
public interface StoreRepository extends MongoRepository<Store, String> {

}