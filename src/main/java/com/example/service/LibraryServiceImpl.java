package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MyRepository;
import com.example.dto.LibRequest;
import com.example.exception.BookNotFoundException;
import com.example.model.Library;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	MyRepository repo;
	
	@Override
	public Library createBk(LibRequest libRequest) {
		// TODO Auto-generated method stub
		Library book = Library.build(libRequest.getId(), libRequest.getAuthor(),libRequest.getTitle(), libRequest.getCost());
		return repo.save(book);
	}

	@Override
	public List readAllBk() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Library updateBk(LibRequest libRequest) throws BookNotFoundException{
		// TODO Auto-generated method stub
		
		if (repo.findById(libRequest.getId()).orElse(null) != null) {
			Library b = Library.build(libRequest.getId(), libRequest.getAuthor(),libRequest.getTitle(), libRequest.getCost());	
			return repo.save(b);
		}else{
			throw new BookNotFoundException("book not found");
		}
		
		
	}
	
	@Override
	public Optional<Library> findById(Integer id) throws BookNotFoundException{
		// TODO Auto-generated method stub
		Optional<Library> book = repo.findById(id);
		if (book != null) {
			return book;
		}else {
			throw new BookNotFoundException("book not found");
		}
		
	}


	@Override
	public void deleteBk(Integer id) {
		// TODO Auto-generated method stub
		Library b = repo.findById(id).orElse(null);
		repo.delete(b);
		
	}

}
