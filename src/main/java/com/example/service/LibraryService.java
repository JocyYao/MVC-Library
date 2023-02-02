package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.dto.LibRequest;
import com.example.exception.BookNotFoundException;
import com.example.model.Library;



public interface LibraryService {
	public Library createBk(LibRequest libRequest);
	public List<Library> readAllBk();
	public Library updateBk(LibRequest libRequest) throws BookNotFoundException;//update by passing full details
	public void deleteBk(Integer id) throws BookNotFoundException;
	public Optional<Library> findById(Integer id) throws BookNotFoundException;

}
