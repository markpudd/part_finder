package com.invoax.partfinder.storeservice.controller;

import com.invoax.partfinder.storeservice.model.StoreConfig;
import com.invoax.partfinder.storeservice.repository.StoreConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ConfigController {
	
	@Autowired
     private StoreConfigRepository repository;
    
    public ConfigController() {
    }

    @RequestMapping("/stores/configs")
    public List<StoreConfig> getStores() {
    	return repository.findAll();
    
    }
    
    @RequestMapping("/stores/configs/{cid}")
    public StoreConfig getStore(@PathVariable String cid)  {
    	return repository.findOne(cid);
    
    }
}