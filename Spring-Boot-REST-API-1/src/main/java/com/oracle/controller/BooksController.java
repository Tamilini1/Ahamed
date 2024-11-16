package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.entity.Books;
import com.oracle.service.BooksServiceImpl;

@RestController
public class BooksController {

	@Autowired private BooksServiceImpl service;
	
	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Books book) {
		Books saveData = service.saveBooks(book);
		String message = null;
		if (saveData != null) {
			message = "Books record has been save successfully !!!";
		}else {
			message ="Failed to save the data";
		}
		return message;
	}
	
	@GetMapping("/getOneBooks/{Id}")
	public Books getOneBook(@PathVariable int Id) {
		Books getOne = service.getBooks(Id);
		return getOne;
	}
	
	@PostMapping("/getAllBooks")
	public List<Books> getAllBooks(){
		List<Books> listAllBooks = service.getAllBooks();
		return listAllBooks;
	}
	
	@DeleteMapping("/deleteBooks/{Id}")
	public void deleteBook(@PathVariable int Id){
		service.deleteBooks(Id);
	}
}
