package com.example.exception;

public class BookNotFoundException extends Exception{
	public BookNotFoundException(String str) {
		super(str);
	}
}
