package com.oracle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
	private String bookId;
	private String bookName;
	@Id
	private Integer iSBN_No;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String author_Name;
	private String publication_Name;
	private Integer year;
	private Integer no_Of_Pages;
	private Integer price;
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", iSBN_No=" + iSBN_No + ", author_Name="
				+ author_Name + ", publication_Name=" + publication_Name + ", year=" + year + ", no_Of_Pages="
				+ no_Of_Pages + ", price=" + price + "]";
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getiSBN_No() {
		return iSBN_No;
	}
	public void setiSBN_No(Integer iSBN_No) {
		this.iSBN_No = iSBN_No;
	}
	public String getAuthor_Name() {
		return author_Name;
	}
	public void setAuthor_Name(String author_Name) {
		this.author_Name = author_Name;
	}
	public String getPublication_Name() {
		return publication_Name;
	}
	public void setPublication_Name(String publication_Name) {
		this.publication_Name = publication_Name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getNo_Of_Pages() {
		return no_Of_Pages;
	}
	public void setNo_Of_Pages(Integer no_Of_Pages) {
		this.no_Of_Pages = no_Of_Pages;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Books(String bookId, String bookName, Integer iSBN_No, String author_Name, String publication_Name,
			Integer year, Integer no_Of_Pages, Integer price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.iSBN_No = iSBN_No;
		this.author_Name = author_Name;
		this.publication_Name = publication_Name;
		this.year = year;
		this.no_Of_Pages = no_Of_Pages;
		this.price = price;
	}
	
	

}
