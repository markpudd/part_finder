package com.invoax.partfinder.storeservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.invoax.partfinder.storeservice.model.Store;
import com.invoax.partfinder.storeservice.repository.StoreRepository;


@RestController
public class StoreController {
	
	@Autowired
     private StoreRepository repository;
    
    public StoreController() {
    }

    @RequestMapping("/stores")
    public List<Store> getStores() {
    	return repository.findAll();
    
    }
    
    
    @RequestMapping(value = "/stores", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Store saveStore(@RequestBody Store store) {
    	return repository.save(store);
    }    
    

    @RequestMapping(value = "/stores", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Store updateStore(@RequestBody Store store) {
    	// look up object  (update would be better here)
    	Store dbStore = repository.findOne(store.get_id());
    	dbStore.setName(store.getName());
    	dbStore.setStid(store.getStid());
    	dbStore.setType(store.getType());
    	return repository.save(dbStore);
    }   
    
    @RequestMapping("/stores/{sid}")
    public Store getStore(@PathVariable String sid)  {
    	return repository.findOne(sid);
    
    }
}