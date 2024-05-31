package com.khalil.Dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.Dojo.models.Ninja;
import com.khalil.Dojo.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	//create
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);	
		
	}
	
	//read all
	 public List<Ninja> allNinjas() {
		 return ninjaRepo.findAll();
		}
	 
	 //read one
	 public Ninja findOne(Long id) {
			Optional<Ninja> ninja = ninjaRepo.findById(id);
			if(ninja.isEmpty()) {
				return null;
			}
			return ninja.get();
		}
			 
}
