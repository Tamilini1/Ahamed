package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.entity.Books;
import com.oracle.repo.BookRepo;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired private BookRepo repo;
	@Override
	public Books saveBooks(Books book) {
		return repo.save(book);
	}

	@Override
	public Books getBooks(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public List<Books> getAllBooks() {
		List<Books> listAllBook = (List<Books>) repo.findAll();
		return listAllBook;
	}
	
	@Override
	public void deleteBooks(int id) {
		repo.deleteById(id);
	}
	
	@Override
	public Books updateBooks(Books book, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	



}
