package com.LoadAPIS.LoadAPIS.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.LoadAPIS.LoadAPIS.Dao.load_repository;
import com.LoadAPIS.LoadAPIS.entities.Loads;

@Component
public class load_Services {
	@Autowired
	private load_repository loadRepository;
	
	
	
	
	
	public List<Loads> getAllLoads()
	{
		List<Loads>list=(List<Loads>)this.loadRepository.findAll();
		return list;
	}
	

	public Optional<Loads> getLoadsById(int loadId)
	{
		Optional<Loads> load=null;
		try {
			
			
		
			load=this.loadRepository.findById(loadId);
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return load;
	}

	public Loads addLoads(Loads L)
	{
		Loads result=loadRepository.save(L);
		return result;
	}
	

	public void deleteLoads(int loadId)
	{
		
		loadRepository.deleteById(loadId);
		
		
	}
	
	public void UpdateLoads(Loads load,int loadId)
	{
		
		load.setId(loadId);
			
		loadRepository.save(load);
		
		}

	
	
	

}
