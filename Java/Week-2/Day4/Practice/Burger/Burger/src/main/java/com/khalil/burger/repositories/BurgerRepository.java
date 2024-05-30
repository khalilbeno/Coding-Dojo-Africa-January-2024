package com.khalil.burger.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.khalil.burger.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long> {
	 // this method retrieves all the books from the database
	 List<Burger> findAll();

}
