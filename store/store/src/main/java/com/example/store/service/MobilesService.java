package com.example.store.service;

import java.util.List;

import com.example.store.model.Mobiles;

public interface MobilesService {
	Mobiles saveMobiles(Mobiles mobiles);
	List<Mobiles> getAllMobiles();
	Mobiles getMobilesById(long id);
	Mobiles updateMobiles(Mobiles mobiles,long id);
	void deleteMobiles(long id);
	List<count> getreports();
	List<count> getstatus();
	List<count> getInactivestatus();
	List<count>getDamagedstatus();

}
