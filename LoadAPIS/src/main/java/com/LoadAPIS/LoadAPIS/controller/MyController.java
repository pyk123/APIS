package com.LoadAPIS.LoadAPIS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LoadAPIS.LoadAPIS.entities.Loads;
import com.LoadAPIS.LoadAPIS.services.load_Services;


@RestController
public class MyController {
	
	private static final String HttpStutus = null;
	@Autowired
	private load_Services loadservices;
	
	
	@GetMapping("/load")
	public ResponseEntity<List<Loads>> getAllLoads() {
		List<Loads> list=loadservices.getAllLoads() ;
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	
	
	@GetMapping("/load/{loadId}")
	public ResponseEntity<Optional<Loads>> getLoadsById(@PathVariable("loadId")int loadId)
	{
		Optional<Loads> load=loadservices.getLoadsById((int) loadId);
		if(load==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(load)) ;
	}
	
	
	
	
	@PostMapping("/load")
	public ResponseEntity<Loads> addLoads(@RequestBody Loads load)
	{
		Loads L=null;
		
	
		try {
		 L= this.loadservices.addLoads(load);
		 System.out.println(load);
		 return ResponseEntity.of(Optional.of(L));
		 
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
	}
	
	
	
	@DeleteMapping("/load/{loadId}")
	public   ResponseEntity<Object> deleteLoads(@PathVariable("loadId") int loadId)
	{
		try {
			this.loadservices.deleteLoads(loadId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}catch (Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	
		
	}
	
	@PutMapping("/load/{loadId}")
	public ResponseEntity<Loads> UpdateLoads(@RequestBody Loads load ,@PathVariable
			("loadId") int loadId)
	{
		try {
	this.loadservices.UpdateLoads( load, loadId);
	return ResponseEntity.ok().body(load);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	
	}


}
