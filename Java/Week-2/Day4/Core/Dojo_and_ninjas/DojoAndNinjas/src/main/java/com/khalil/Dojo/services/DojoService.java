package com.khalil.Dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.Dojo.models.Dojo;
import com.khalil.Dojo.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;
	
	 //read all
	 public List<Dojo> allDojos() {
	     return dojoRepo.findAll();
	 }
	//create
		public Dojo createDojo(Dojo dojo) {
		     return dojoRepo.save(dojo);
		}
	
	//read one
		public Dojo findOne(Long id) {
			Optional<Dojo> dojo = dojoRepo.findById(id);
			if(dojo.isEmpty()) {
				return null;
			}
			return dojo.get();
		}
}
