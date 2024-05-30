package com.khalil.travels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.travels.models.Travel;
import com.khalil.travels.repositories.TravelRepository;

@Service
public class TravelService {
	@Autowired
	private TravelRepository travelRepo;
	
	//create
	public Travel createTravel(Travel travel) {
	     return travelRepo.save(travel);
	}
	 
	 //read all
	 public List<Travel> allTravels() {
	     return travelRepo.findAll();
	 }
	 //update
	 public Travel updateTravel(Travel t) {
	        return travelRepo.save(t);
	    }
	 
	 //find one
	 public Travel findTravel(Long id) {
	        return travelRepo.findById(id).orElse(null);
	    }
	//delete 
	 public void deleteTravel(Long id) {
			travelRepo.deleteById(id);
		}
}
