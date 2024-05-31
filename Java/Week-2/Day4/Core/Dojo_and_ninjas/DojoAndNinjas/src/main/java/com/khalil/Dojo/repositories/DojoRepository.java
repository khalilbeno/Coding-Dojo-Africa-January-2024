package com.khalil.Dojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.khalil.Dojo.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
