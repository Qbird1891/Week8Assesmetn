package week8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import week8.beans.Books;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 18, 2023
 */
@Configuration
public class BooksBeanConfig {
	@Bean
	public Books books() {
		Books books = new Books();
		return books;
	}

}
