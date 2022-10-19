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

import com.example.store.model.Mobiles;
import com.example.store.service.MobilesService;
import com.example.store.service.count;

@CrossOrigin
@RestController
//@RequestMapping("/api/mobiles")
public class MobilesController {
	private MobilesService mobilesService;

	public MobilesController(MobilesService mobilesService) {
		super();
		this.mobilesService = mobilesService;
	}
	@PostMapping("/api/addmobiles")
	public ResponseEntity<Mobiles> saveMobiles(@RequestBody Mobiles mobiles){
		return new ResponseEntity<Mobiles>(mobilesService.saveMobiles(mobiles),HttpStatus.CREATED);
	}
	@GetMapping("/api/getmobiles")
	public List<Mobiles> getAllMobiles(){
		return mobilesService.getAllMobiles();
		
	}
	@GetMapping("/api/getmobiles/{id}")
	public ResponseEntity<Mobiles> getMobilesById(@PathVariable("id") long mobilesId){
		return new ResponseEntity<Mobiles>(mobilesService.getMobilesById(mobilesId),HttpStatus.OK);
	}
	
	@PutMapping("/api/updatemobiles")
	public ResponseEntity<Mobiles> updateMobiles(@RequestParam("id") long id,@RequestBody Mobiles mobiles){
		return new ResponseEntity<Mobiles>(mobilesService.updateMobiles(mobiles, id),HttpStatus.OK);	
		
	}
	@DeleteMapping("/api/deletemobiles/{id}")
	public ResponseEntity<String> deleteMobiles(@PathVariable("id")long id){
		mobilesService.deleteMobiles(id);
		return new ResponseEntity<String>("Mobile with id is " + id +" deleted successfully",HttpStatus.OK);
	}
	@GetMapping("/api/get")
	public List<count>  getreports(){
		return mobilesService.getreports();
		}
	@GetMapping("/api/status")
	public List<count>  getstatus(){
		return mobilesService.getstatus();
		}
	@GetMapping("/api/inactivestatus")
	public List<count>  getInactivestatus(){
		return mobilesService.getInactivestatus();
		}
	@GetMapping("/api/damagedstatus")
	public List<count>  getDamagedstatus(){
		return mobilesService.getDamagedstatus();
		}
	

}
