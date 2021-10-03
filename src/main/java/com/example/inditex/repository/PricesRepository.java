package com.example.inditex.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.inditex.persistence.Prices;

public interface PricesRepository extends CrudRepository<Prices, Integer> {
	
	Iterable<Prices> findAll();

}