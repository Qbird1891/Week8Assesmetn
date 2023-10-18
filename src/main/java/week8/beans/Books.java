package week8.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 18, 2023
 */
@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;
	private String title;
	private String author;
	private String category;
	private int publicationDate;
	/**
	 * @return the rowId
	 */
	public int getRowId() {
		return rowId;
	}
	/**
	 * @param rowId the rowId to set
	 */
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the publicationDate
	 */
	public int getPublicationDate() {
		return publicationDate;
	}
	/**
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	@Override
	public String toString() {
		return "Books[Title=" + title + ", Author=" + author + ", Category=" + category + ", Publication Date=" + publicationDate + "]"; 
 	}

}
