package com.invoax.partfinder.storeservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection="configs")
public class StoreConfig {

	@Id private String _id;



	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	private String name;
    private List<Map<String,Row>> rows;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Map<String, Row>> getRows() {
		return rows;
	}

	public void setRows(List<Map<String, Row>> rows) {
		this.rows = rows;
	}


}