package be.weve.jpatest;

import be.weve.jpatest.business.Person;
import be.weve.jpatest.service.manager.PersonManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class App {

    private PersonManager personManager;

    public App(PersonManager personManager) {
        this.personManager = personManager;
    }

    public void run() {
        System.out.println("***************************************");
        System.out.println("** Create test data and store in db  **");
        System.out.println("***************************************");

        createTestData();

        System.out.println("*************************");
        System.out.println("** Call data and show  **");
        System.out.println("*************************");

        showTestData();
    }

    private void createTestData() {
        createPerson("Wesley", "Vercoutere");
        createPerson("Vanessa", "De Letter");
        createPerson("Jarno", "Vercoutere");
        createPerson("Lynn", "Vercoutere");
    }

    private void createPerson(String firstname, String lastname) {
        Person p = new Person();
        p.setFirstname(firstname);
        p.setLastname(lastname);

        personManager.addPerson(p);
    }

    private void showTestData() {
        List<Person> persons = personManager.getAllPersons();
        persons.forEach(System.out::println);
    }
}
