package com.example.service;

import java.util.List;

import com.example.model.Library;



public interface LibraryService {
	public Library createBk(Library book);
	public List<Library> readAllBk();
	public Library updateBk(Library book);//update by passing full details
	public void deleteBk(Integer id);

}
