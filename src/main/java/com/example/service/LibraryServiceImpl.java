package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MyRepository;
import com.example.model.Library;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	MyRepository repo;
	
	@Override
	public Library createBk(Library book) {
		// TODO Auto-generated method stub
		repo.save(book);
		return book;
	}

	@Override
	public List readAllBk() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Library updateBk(Library book) {
		// TODO Auto-generated method stub
		Library b1 = repo.findById(book.getId()).orElse(null);
		b1.setAuthor(book.getAuthor());
		b1.setCost(book.getCost());
		b1.setTitle(book.getTitle());
		return repo.save(b1);
	}
	
	public Object findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}


	@Override
	public void deleteBk(Integer id) {
		// TODO Auto-generated method stub
		Library b = repo.findById(id).orElse(null);
		repo.delete(b);
		
	}

}
