package com.example.store.service;

import java.util.List;

import com.example.store.model.Server;

public interface ServerService {
	Server saveServer(Server server);
	List<Server> getAllServers();
	Server getServerById(long id);
	Server updateServerById(Server server,long id);
	void deleteServerById(long id);
	List<count1> getNoSever();
	List<count1> getActive();
	List<count1> getInactive();
	List<count1> getDamaged();
	

}
