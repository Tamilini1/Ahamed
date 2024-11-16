package com.oracle.service;

import java.util.List;

import com.oracle.entity.Books;


public interface BooksService {

	public Books saveBooks(Books employee);
	public Books updateBooks(Books employee,int id);
	public Books getBooks(int id);
	public void deleteBooks(int id);
	public List<Books> getAllBooks();

}
