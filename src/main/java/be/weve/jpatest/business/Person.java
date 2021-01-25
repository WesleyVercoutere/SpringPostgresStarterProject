package be.weve.jpatest.business;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Person extends BaseEntity {

    @Column(nullable=false)
    private String firstname, lastname;

    public Person() {
        this.firstname = null;
        this.lastname = null;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getId()).append(". ").append(firstname).append(" ").append(lastname);

        return sb.toString();
    }
}
