package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Library;

@Repository
public interface MyRepository extends JpaRepository<Library, Integer>{
	Library findById(int id);
}
