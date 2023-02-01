package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.client;
import com.example.demo.Model.stock;

public interface stockRepository extends JpaRepository<stock,Long>{

}
