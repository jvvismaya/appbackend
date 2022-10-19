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

import com.example.store.model.Accessories;
import com.example.store.service.AccessoriesService;
import com.example.store.service.count;
import com.example.store.service.count2;

@CrossOrigin
@RestController

//@RequestMapping("/api/accessories")
public class AccessoriesController {
	private AccessoriesService accessoriesService;

	public AccessoriesController(AccessoriesService accessoriesService) {
		super();
		this.accessoriesService = accessoriesService;
	}
	@PostMapping("/api/addaccessories")
	public ResponseEntity<Accessories> saveAccessories(@RequestBody Accessories accessories){
		return new ResponseEntity<Accessories>(accessoriesService.saveAccessories(accessories),HttpStatus.OK);
	}
	@GetMapping("/api/getaccessories")
	public List<Accessories> getAllAccessories(){
		return accessoriesService.getAllAccessories();
		
	}
	@GetMapping("/api/getaccessories/{id}")
	public ResponseEntity<Accessories> getAccessoriesById(@PathVariable("id") long id){
		return new ResponseEntity<Accessories>(accessoriesService.getAccessoriesById(id),HttpStatus.OK);
	}
	@PutMapping("/api/updateaccessories")
	public ResponseEntity<Accessories> updateAccessories(@RequestParam("id") long id, @RequestBody Accessories accessories){
		return new ResponseEntity<Accessories>(accessoriesService.updateAccessories(accessories, id),HttpStatus.OK);
		
	}
	@DeleteMapping("/api/deleteaccessories/{id}")
	public ResponseEntity<String> deleteAccessories(@PathVariable("id")long id){
		accessoriesService.deleteAccessories(id);
		return new ResponseEntity<String>("Accessories with id" + id + " is deleted successfully",HttpStatus.OK);
		
	}
	@GetMapping("/api/totalaccessories")
	public List<count2> totalaccessories(){
		return accessoriesService.totalaccessories();
	
}
	@GetMapping("/api/activeaccessories")
	public List<count2> totalactivestatus(){
		return accessoriesService.totalactivestatus();

}
	@GetMapping("/api/inactiveaccessories")
	public List<count2> totalinactivestatus(){
		return accessoriesService.totalinactivestatus();

}
	@GetMapping("/api/Damagedaccessories")
	public List<count2> totalDamaged(){
		return accessoriesService.totalDamaged();

}
}
