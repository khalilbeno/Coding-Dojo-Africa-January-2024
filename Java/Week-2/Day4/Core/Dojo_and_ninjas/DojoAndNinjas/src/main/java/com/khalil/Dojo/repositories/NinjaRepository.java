package com.khalil.Dojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.khalil.Dojo.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
	
}
