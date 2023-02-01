package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.client;

@Repository
public interface clientRepository extends JpaRepository<client,Long>{
	
}