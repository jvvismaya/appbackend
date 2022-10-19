package com.example.store.service.impl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.store.exception.ResourceNotFoundException;
import com.example.store.model.Mobiles;
import com.example.store.repository.MobilesRepository;
import com.example.store.service.MobilesService;
import com.example.store.service.count;

@Service
public class MobilesServiceImpl implements MobilesService{
	
	private MobilesRepository mobilesRepository;

	public MobilesServiceImpl(MobilesRepository mobilesRepository) {
		super();
		this.mobilesRepository = mobilesRepository;
	}

	@Override
	public Mobiles saveMobiles(Mobiles mobiles) {
		// TODO Auto-generated method stub
		return mobilesRepository.save(mobiles);
	}

	@Override
	public List<Mobiles> getAllMobiles() {
		// TODO Auto-generated method stub
		return mobilesRepository.findAll();
	}

	@Override
	public Mobiles getMobilesById(long id) {
		//Optional<Mobiles> mobiles = mobilesRepository.findById(id);
		// check wheather mobile with id is present or not
		//if(mobiles.isPresent()) {
			//return mobiles.get();
		//}else{
			//throw new ResourceNotFoundException("Mobiles","Id",id);
		//}
		return mobilesRepository.findById(id).orElseThrow(()-> 
		                 new ResourceNotFoundException("Mobiles","Id",id));
	}

	@Override
	public Mobiles updateMobiles(Mobiles mobiles, long id) {
		//check mobile with id is present
		Mobiles existingMobiles = mobilesRepository.findById(id).orElseThrow(()
				-> new ResourceNotFoundException("Mobiles","Id",id));
		existingMobiles.setType(mobiles.getType());
		existingMobiles.setManufacturer(mobiles.getManufacturer());
		existingMobiles.setModel(mobiles.getModel());
		existingMobiles.setOs(mobiles.getOs());
		existingMobiles.setDate(mobiles.getDate());
		existingMobiles.setClient(mobiles.getClient());
		existingMobiles.setSeriel(mobiles.getSeriel());
		existingMobiles.setLocation(mobiles.getLocation());
		existingMobiles.setStatus(mobiles.getStatus());
		existingMobiles.setIp(mobiles.getIp());
		existingMobiles.setServer(mobiles.getServer());
		existingMobiles.setPhone(mobiles.getPhone());
		//save this
		mobilesRepository.save(existingMobiles);
		
		return existingMobiles;
	}

	@Override
	public void deleteMobiles(long id) {
		//mobilesRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Mobiles","Id",id));
		mobilesRepository.deleteById(id);
		
	}

	@Override
	public List<count> getreports() {
		long a=mobilesRepository.countMobile();

		long b = mobilesRepository.countStatus();
		long c = mobilesRepository.countinactiveStatus();
		long d = mobilesRepository.countdamagedStatus();
		List<count> list=new ArrayList<count>();
		count count=new count();
		count.setTotal_no_mobile_devices(a);
		count.setStatus(b);
		count.setMobiles_inactive_status(c);
		count.setMobiles_damaged_status(d);
		
		list.add(count);
		return list;
	}

	@Override
	public List<count> getstatus() {
		List<count> list = new ArrayList<count>();
		count count=new count();
		//count.setStatus(b);
		list.add(count);
		return list;
	}

	@Override
	public List<count> getInactivestatus() {
		
		// TODO Auto-generated method stub
		List<count> list = new ArrayList<count>();
		count count = new count();
		//count.setMobiles_inactive_status(c);
		list.add(count);
		return list;
	}

	@Override
	public List<count> getDamagedstatus() {
		// TODO Auto-generated method stub
		List<count> list = new ArrayList<count>();
		count count = new count();
		list.add(count);
		return list;
	}

	

	
	 
	

}
