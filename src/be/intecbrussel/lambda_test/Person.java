package be.intecbrussel.lambda_test;

import java.time.LocalDate;
import java.util.Objects;

public class Person{

    public String firstname;
    public String lastName;
    public LocalDate dateOfBirth;

    public Person(String firstname, String lastName, LocalDate dateOfBirth){
        this.firstname = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {

        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, dateOfBirth);
    }
}