package com.example.store.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.store.exception.ResourceNotFoundException;
import com.example.store.model.Accessories;
import com.example.store.repository.AccessoriesRepository;
import com.example.store.service.AccessoriesService;
import com.example.store.service.count;
import com.example.store.service.count2;

@Service
public class AccessoriesServiceImpl implements AccessoriesService {
	
	private AccessoriesRepository accessoriesRepository;

	public AccessoriesServiceImpl(AccessoriesRepository accessoriesRepository) {
		super();
		this.accessoriesRepository = accessoriesRepository;
	}

	@Override
	public Accessories saveAccessories(Accessories accessories) {
		// TODO Auto-generated method stub
		return accessoriesRepository.save(accessories);
	}

	@Override
	public List<Accessories> getAllAccessories() {
		// TODO Auto-generated method stub
		return accessoriesRepository.findAll();
	}

	@Override
	public Accessories getAccessoriesById(long id) {
		// TODO Auto-generated method stub
		Optional<Accessories> accessories = accessoriesRepository.findById(id);
		if(accessories.isPresent()) {
			return accessories.get();
		}else {
			throw new ResourceNotFoundException("Accessories","Id",id);
		}
		//return accessoriesRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Accessories","Id",id));
	}

	@Override
	public Accessories updateAccessories(Accessories accessories, long id) {
		Accessories existingAccessories = accessoriesRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Accessories","Id",id));
		existingAccessories.setTypeofdevice(accessories.getTypeofdevice());
		existingAccessories.setManufacturer(accessories.getManufacturer());
		existingAccessories.setModel(accessories.getModel());
		existingAccessories.setOs(accessories.getOs());
		existingAccessories.setDateofpurchase(accessories.getDateofpurchase());
		existingAccessories.setCurrentclient(accessories.getCurrentclient());
		existingAccessories.setSerielnumber(accessories.getSerielnumber());
		existingAccessories.setLocation(accessories.getLocation());
		existingAccessories.setStatus(accessories.getStatus());
		
		accessoriesRepository.save(existingAccessories);
		// TODO Auto-generated method stub
		return existingAccessories;
	}

	@Override
	public void deleteAccessories(long id) {
		// TODO Auto-generated method stub
		
		accessoriesRepository.deleteById(id);
		
	}

	@Override
	public List<count2> totalaccessories() {
		// TODO Auto-generated method stub
		long a = accessoriesRepository.coutAccessories();
		long b = accessoriesRepository.countActiveStaus();
		long c = accessoriesRepository.countInActiveStaus();
		long d= accessoriesRepository.countDamagedStaus();
		List<count2> list = new ArrayList<count2>();
		count2 count = new count2();
		count.setTotal_no_of_accessories(a);
		count.setTotal_active_status(b);
		count.setTotal_inactive_status(c);
		count.setDamaged(d);
		list.add(count);
		return list;
	}

	@Override
	public List<count2> totalactivestatus() {
		// TODO Auto-generated method stub
		
		List<count2> list = new ArrayList<count2>();
		count2 count = new count2();
		
		list.add(count);
		return list;
	}

	@Override
	public List<count2> totalinactivestatus() {
		// TODO Auto-generated method stub
		List<count2> list = new ArrayList<count2>();
		count2 count = new count2();
		list.add(count);
		return list;
	}

	@Override
	public List<count2> totalDamaged() {
		// TODO Auto-generated method stub
		List<count2> list = new ArrayList<count2>();
		count2 count = new count2();
		list.add(count);
		return list;
	
	}


	//@Override
	//public List<count> totalaccessories() {
		// TODO Auto-generated method stub
		//long a = accessoriesRepository.count();
		//List<count> list = new ArrayList<count>();
		//count count = new count();
		//count.setTotal_no_of_accessories(a);
		//list.add(count);
		//return list;
	//}

	}

	
	

	
	
	


