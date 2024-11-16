package com.oracle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	private String bookName;
	private String iSBNNo;
	private String authorName;
	private Integer publicationYear;
	private Integer publicationName;
	private Integer noOfPages;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getiSBNNo() {
		return iSBNNo;
	}
	public void setiSBNNo(String iSBNNo) {
		this.iSBNNo = iSBNNo;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(Integer publicationYear) {
		this.publicationYear = publicationYear;
	}
	public Integer getPublicationName() {
		return publicationName;
	}
	public void setPublicationName(Integer publicationName) {
		this.publicationName = publicationName;
	}
	public Integer getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(Integer noOfPages) {
		this.noOfPages = noOfPages;
	}
	public Books(Integer bookId, String bookName, String iSBNNo, String authorName, Integer publicationYear,
			Integer publicationName, Integer noOfPages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.iSBNNo = iSBNNo;
		this.authorName = authorName;
		this.publicationYear = publicationYear;
		this.publicationName = publicationName;
		this.noOfPages = noOfPages;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", iSBNNo=" + iSBNNo + ", authorName="
				+ authorName + ", publicationYear=" + publicationYear + ", publicationName=" + publicationName
				+ ", noOfPages=" + noOfPages + "]";
	}

}
