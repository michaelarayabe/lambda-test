package be.intecbrussel.lambda_test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

public class BookApp{

    public static void main(String[] args) {

        Person person = new Person("Rhiannon","Frater",LocalDate.of("1990-01-11"));
        Person person2 = new Person("Yann","Martel",LocalDate.parse("1963-06-25"));
        Person person3 = new Person(" David","Moody",LocalDate.parse("1980-01-11"));
        Person person4 = new Person("alex","pomi",LocalDate.parse("1989-01-11"));
        Person person5 = new Person("awet","seifu",LocalDate.parse("1910-01-11"));


        Book book1 = new Book("The First Days", person, LocalDate.parse("1920-01-11"),"triller");
        Book book2 = new Book("Life Of Pi",  person2, LocalDate.parse("2006-07-29"), "Adventure");
        Book book3 = new Book("Autumn",  person3, LocalDate.parse("2006"), "Adventure");
        Book book4 = new Book("Life Of Pi",  person4, LocalDate.parse("2006"), "Adventure");
        Book book5 = new Book("Life Of Pi",  person5, LocalDate.parse("2006"), "Adventure");


        Book[] books = {book1,book2, book3, book4, book5};
        Person[] persons = {person, person2, person3, person4, person5};


        getNewestBook(books);

        }

    public static Book getNewestBook(Book[] books){

        Stream<Book> bo = Stream.of(books).sorted(Comparator.comparing(e -> ((Book)e).getReleaseDate()));
        return bo.;
    }

    public static void printyoungestAuthor(Book[] books) {

        Stream<Book> pers = Stream.of(books).sorted(Comparator.comparing(e -> ((Person)e).getDateOfBirth()));

        System.out.println(pers);


    }

    public static void printSortedByTitle(Book[] books) {


    }

    public static void countBooksPerAuthor(Book[] books) {


    }

    public static void printBooksReleasedIn2016(Book[] books) {


    }




}

