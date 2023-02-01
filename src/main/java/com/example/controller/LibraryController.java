package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Library;
import com.example.service.LibraryService;
import com.example.service.LibraryServiceImpl;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryService ls;
	
	@PostMapping("/create")
	public Library createBk(@RequestBody Library bk) {
		System.out.println("create");
		return ls.createBk(bk);
		
	}
	
	@GetMapping("/read")
	public List<Library> readAllBk() {
		System.out.println("read");
		return ls.readAllBk();
		
	}
	
	@PutMapping("/update")
	public Library updateBk(@RequestBody Library bk) {
		System.out.println("update");
		return ls.updateBk(bk);
	}
	
	
	@PutMapping("/delete/{id}")
	public void deleteBk(@PathVariable Integer id) {
		System.out.println("delete");
		ls.deleteBk(id);
	}
}
