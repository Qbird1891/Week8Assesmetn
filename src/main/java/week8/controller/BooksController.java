package week8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import week8.beans.Books;
import week8.repo.IBooks;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 18, 2023
 */
@Controller
public class BooksController {
	@Autowired
	IBooks repo;
	
	@GetMapping("/index")
	public String getForm(Books books) {
		return "index";
	}
	
    @PostMapping("/save-books")
    public String saveBookDetails(Books books, Errors errors, Model model) {
    	if (null != errors && errors.getErrorCount() > 0) {
            return "index";
        } else {
        	repo.save(books);
            model.addAttribute("successMsg", "Details saved successfully!!");
            return "success";
        }
    }

}
