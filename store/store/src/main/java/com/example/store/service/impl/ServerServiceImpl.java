package com.example.store.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.store.exception.ResourceNotFoundException;
import com.example.store.model.Server;
import com.example.store.repository.ServerRepository;
import com.example.store.service.ServerService;
import com.example.store.service.count;
import com.example.store.service.count1;

@Service
public class ServerServiceImpl implements ServerService {
	
	private ServerRepository serverRepository;

	public ServerServiceImpl(ServerRepository serverRepository) {
		super();
		this.serverRepository = serverRepository;
	}

	@Override
	public Server saveServer(Server server) {
		// TODO Auto-generated method stub
		return serverRepository.save(server);
	}

	@Override
	public List<Server> getAllServers() {
		// TODO Auto-generated method stub
		return serverRepository.findAll();
	}

	@Override
	public Server getServerById(long id) {
		Optional<Server> server = serverRepository.findById(id);
		if(server.isPresent()) {
			return server.get();
		}else {
			throw new ResourceNotFoundException("Server","Id",id);
		}
			//return serverRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Server","Id",id));
}

	@Override
	public Server updateServerById(Server server, long id) {
		// check id is present
		Server existingServer = serverRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Server","Id",id));
		existingServer.setTypeofdevice(server.getTypeofdevice());
		existingServer.setManufacturer(server.getManufacturer());
		existingServer.setModel(server.getManufacturer());
		existingServer.setOs(server.getOs());
		existingServer.setDateofpurchase(server.getDateofpurchase());
		existingServer.setCurrentclient(server.getCurrentclient());
		existingServer.setSerielnumber(server.getSerielnumber());
		existingServer.setLocation(server.getLocation());
		existingServer.setStatus(server.getStatus());
		existingServer.setIp(server.getIp());
		
		serverRepository.save(existingServer);
		
		return existingServer;
	}

	@Override
	public void deleteServerById(long id) {
		// check id is present
		serverRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Server","Id",id));
		serverRepository.deleteById(id);
		
	}

	@Override
	public List<count1> getNoSever() {
		// TODO Auto-generated method stub
		Long a = serverRepository.countServer();
		Long b =serverRepository.countActiveStaus();
		Long c = serverRepository.countInActiveStaus();
		Long d = serverRepository.countDamagedStaus();
		List<count1> list=new ArrayList<count1>();
		count1 count=new count1();
		count.setTotal_no_severs(a);
		count.setActiveStaus(b);
		count.setInactiveStatus(c);
		count.setDamaged(d);
		list.add(count);
		return list;
	}

	@Override
	public List<count1> getActive() {
		// TODO Auto-generated method stub
		List<count1>list = new ArrayList<count1>();
		count1 count = new count1();
		list.add(count);
		return list;
	}

	@Override
	public List<count1> getInactive() {
		// TODO Auto-generated method stub
		List<count1>list = new ArrayList<count1>();
		count1 count = new count1();
		list.add(count);
		return list;
	}

	@Override
	public List<count1> getDamaged() {
		// TODO Auto-generated method stub
		List<count1>list = new ArrayList<count1>();
		count1 count = new count1();
		list.add(count);
		return list;
		
	}


	

	

	
	
	}


