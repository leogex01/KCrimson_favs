package album;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import album.beans.Records;
import album.controller.BeanConfiguration;
import album.repository.RecordsRepository;


@SpringBootApplication
public class KCrimsonFavsApplication implements CommandLineRunner {

public static void main(String[] args) {
	SpringApplication.run(KCrimsonFavsApplication.class, args);
		
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Records a = appContext.getBean("records", Records.class);
		//		System.out.println(a.toString());
				}
@Autowired
RecordsRepository repo;

@Override	
public void run(String... args) throws Exception {
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

	
	Records c = appContext.getBean("records", Records.class);
	c.setGuitarist("Fripp");
	repo.save(c);
	
    Records r = new Records("In the Wake of Poseidon", 1970, 3.9);
    r.setGuitarist("Fripp");
    repo.save(r);
        
    Records s = new Records("Lizard", 1970, 4.5);
    s.setGuitarist("Fripp");
    repo.save(s);
    
    List<Records> allMyContacts = repo.findAll();
    for(Records people: allMyContacts) {
    System.out.println(people.toString());
   }
 }
}
   
   
   
   

