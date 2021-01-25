package be.weve.jpatest.service.manager;

import be.weve.jpatest.business.Person;
import org.springframework.stereotype.Service;
import be.weve.jpatest.repository.PersonRepository;

import java.util.List;

@Service
public class PersonManager {

    private PersonRepository repo;

    public PersonManager(PersonRepository personRepository) {
        this.repo = personRepository;
    }

    public void addPerson(Person person) {
        repo.save(person);
    }

    public List<Person> getAllPersons() {
        return repo.findAll();
    }
}
