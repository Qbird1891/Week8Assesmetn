package week8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import week8.beans.Books;
import week8.config.BooksBeanConfig;
import week8.repo.IBooks;

@SpringBootApplication
public class Week8AssesmentQbirdsleyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week8AssesmentQbirdsleyApplication.class, args);
	}
	@Autowired
	IBooks repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		doWork();
		
	}
	
	public void doWork() {
		System.out.println("persisting records");
		persistRecords();
		System.out.println("done");
		
		System.out.println("getting records");
		
		for(Books b : getBooks()) {
			System.out.println(b.toString());
		}
		System.out.println("done");
		
		
	}
	
	private void persistRecords() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BooksBeanConfig.class);
		Books books = context.getBean("books", Books.class);
		
		
		books.setTitle("A Clash of Kings");
		books.setAuthor("George RR Martin");
		books.setCategory("Fantasy");
		books.setPublicationDate(2002);
		
		repo.save(books);
	}
	private List<Books> getBooks(){
		return repo.findAll();
	}

}
