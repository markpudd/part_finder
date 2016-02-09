package com.invoax.partfinder.storeservice.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;

@Document(collection="stores")
public class Store {

	@Id private String _id;

    private String name;
   
    private String stid;
    private String type;
 
    private Map<String,List<String>> stored;

	public String getStid() {
		return stid;
	}



	public void setStid(String stid) {
		this.stid = stid;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String get_id() {
		return _id;
	}



	public void set_id(String _id) {
		this._id = _id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Map<String, List<String>> getStored() {
		return stored;
	}



	public void setStored(Map<String, List<String>> stored) {
		this.stored = stored;
	}
	
	
}