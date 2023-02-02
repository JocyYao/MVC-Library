package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.LibRequest;
import com.example.exception.BookNotFoundException;
import com.example.model.Library;
import com.example.service.LibraryService;
import com.example.service.LibraryServiceImpl;
import javax.validation.Valid;


@RestController
public class LibraryController {
	
	@Autowired
	LibraryService ls;
	
	@PostMapping("/create")
	public ResponseEntity<Library> createBk(@RequestBody @Valid LibRequest lr) {
		System.out.println("create");
		return new ResponseEntity<>(ls.createBk(lr), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/read")
	public List<Library> readAllBk() {
		System.out.println("read");
		return ls.readAllBk();
		
	}
	
	@GetMapping("/findById/{x}")
	public List<Library> findByID(@PathVariable Integer id) {
		System.out.println("read");
		return ls.readAllBk();
		
	}
	
	@PutMapping("/update")
	public Library updateBk(@RequestBody @Valid LibRequest lr) throws BookNotFoundException {
		System.out.println("update");
		return ls.updateBk(lr);
	}
	
	
	@PutMapping("/delete/{id}")
	public void deleteBk(@PathVariable Integer id) throws BookNotFoundException {
		System.out.println("delete");
		ls.deleteBk(id);
	}
}
