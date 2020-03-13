package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"bookNumber"})})
public class BookBean {
	@Id
	@GeneratedValue
	private Integer bookId;	
	@NotEmpty(message = "Book number can't empty")
	 @Column(unique =true )
	private String bookNumber;
	@NotEmpty(message = "Subject can't empty")
	private String subject;
	@NotEmpty(message = "Book Name can't empty")
	private String bookName;
	@NotEmpty(message = "Author name can't empty")
	private String authorName;
	private Date issueDate;
	private Date dueDate;
	private Date returnDate;
	private String issueTo;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getIssueTo() {
		return issueTo;
	}
	public void setIssueTo(String issueTo) {
		this.issueTo = issueTo;
	}
	
	
}