package com.example.store.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.model.Server;
import com.example.store.service.ServerService;
import com.example.store.service.count;
import com.example.store.service.count1;

@CrossOrigin
@RestController
//@RequestMapping("/api/server")
public class ServerController {
	
	private ServerService serverService;

	public ServerController(ServerService serverService) {
		super();
		this.serverService = serverService;
	}
	
	@PostMapping("/api/addserver")
	public ResponseEntity<Server> saveServer(@RequestBody Server server){
		return new ResponseEntity<Server>(serverService.saveServer(server),HttpStatus.CREATED);

}
	@GetMapping("/api/server")
	public List<Server> getAllServers(){
		return serverService.getAllServers();
		
	}
	
	@GetMapping("/api/server/{id}")
	public ResponseEntity<Server> getServerById(@PathVariable("id")long serverId){
		return new ResponseEntity<Server>(serverService.getServerById(serverId),HttpStatus.OK);
	}
	
	@PutMapping("/api/updateserver")
	public ResponseEntity<Server> updateServerById(@RequestParam("id")long id, @RequestBody Server server){
		return new ResponseEntity<Server>(serverService.updateServerById(server, id),HttpStatus.OK);
		
	}
	@DeleteMapping("/api/deleteserver/{id}")
	public ResponseEntity<String> deleteServerById(@PathVariable("id")long id){
		serverService.deleteServerById(id);
		return new ResponseEntity<String>("Server with id " + id + " is deleted successfully",HttpStatus.OK);
	}
	@GetMapping("/api/noSever")
	public List<count1> getNoSever(){
		return serverService.getNoSever();
		
	}
	@GetMapping("/api/active")
	public List<count1> getActive(){
		return serverService.getActive();
		
	}
	@GetMapping("/api/inactive")
	public List<count1>getInactive(){
		return serverService.getInactive();
		
	}
	@GetMapping("/api/damaged")
	public List<count1>getDamaged(){
		return serverService.getDamaged();
		
	}
}
