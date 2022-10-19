package com.example.store.service;

import java.util.List;

import com.example.store.model.Accessories;

public interface AccessoriesService {
	Accessories saveAccessories(Accessories accessories);
	List<Accessories> getAllAccessories();
	Accessories getAccessoriesById(long id);
	Accessories updateAccessories(Accessories accessories,long id);
	void deleteAccessories(long id);
	List<count2> totalaccessories();
	List<count2> totalactivestatus();
	List<count2> totalinactivestatus();
	List<count2> totalDamaged();
	
	
	

}
