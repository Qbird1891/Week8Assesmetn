package week8.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import week8.beans.Books;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 18, 2023
 */
@Repository
public interface IBooks  extends JpaRepository<Books, Long> {

}
