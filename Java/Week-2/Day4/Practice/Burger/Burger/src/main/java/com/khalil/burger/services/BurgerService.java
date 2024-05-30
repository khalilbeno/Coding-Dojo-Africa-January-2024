package com.khalil.burger.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.burger.models.Burger;
import com.khalil.burger.repositories.BurgerRepository;

@Service
public class BurgerService {
	@Autowired
	private BurgerRepository burgerRepo;
	
	//create
	public Burger createBurger(Burger burger) {
	     return burgerRepo.save(burger);
	}
	 
	 //read all
	 public List<Burger> allBurgers() {
	     return burgerRepo.findAll();
	 }
	 //update
	 public Burger updateBurger(Burger b) {
	        return burgerRepo.save(b);
	    }
	 
	 //find one
	 public Burger findBurger(Long id) {
	        return burgerRepo.findById(id).orElse(null);
	    }
}
