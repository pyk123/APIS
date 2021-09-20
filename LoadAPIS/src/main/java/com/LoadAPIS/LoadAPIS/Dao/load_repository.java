package com.LoadAPIS.LoadAPIS.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.LoadAPIS.LoadAPIS.entities.Loads;



public interface load_repository extends CrudRepository<Loads,Integer>{
	public Optional<Loads> findById(int id);

}
