package com.khalil.travels.services;

import java.util.List;
import java.util.Optional;

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
	 public Travel findTravelByID(Long id) {
	     Optional<Travel> optionalTravel = travelRepo.findById(id);
	     if(optionalTravel.isPresent()) {
	         return optionalTravel.get();
	     } else {
	         return null;
	     }
	 }
	    
	//delete 
	 public void deleteTravel(Long id) {
			travelRepo.deleteById(id);
		}
}
