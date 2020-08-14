package be.intecbrussel.lambda_test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookApp{

    public static void main(String[] args) {

        Person person = new Person("Rhiannon","Frater",LocalDate.of(1986,11,12));
        Person person2 = new Person("Yann","Martel",LocalDate.of(1984,11,12));
        Person person3 = new Person(" David","Moody",LocalDate.of(1999,11,12));
        Person person4 = new Person("alex","pomi",LocalDate.of(2000,11,12));
        Person person5 = new Person("awet","seifu",LocalDate.of(1972,11,12));


        Book book1 = new Book("The First Days", person, LocalDate.of(1916,11,12),"triller");
        Book book2 = new Book("Life Of Pi",  person2, LocalDate.of(1996,11,12), "Adventure");
        Book book3 = new Book("Autumn",  person3, LocalDate.of(1943,11,12), "Adventure");
        Book book4 = new Book("Life Of Pi",  person4, LocalDate.of(1921,11,12), "Adventure");
        Book book5 = new Book("Life Of Pi",  person5, LocalDate.of(1917,11,12), "Adventure");


        Book[] books = {book1,book2, book3, book4, book5};
        Person[] persons = {person, person2, person3, person4, person5};


        System.out.println(getNewestBook(books));

        }

    public static Book getNewestBook(Book[] books){

        List<Book> bo = Stream.of(books).sorted(Comparator.comparing(e -> ((Book)e).getReleaseDate())).collect(Collectors.toList());

        return bo.get(0);
    }

    /*public static void printyoungestAuthor(Book[] books) {

        Stream<Book> pers = Stream.of(books).sorted(Comparator.comparing(e -> ((Person)e).getDateOfBirth()));

        System.out.println(pers);


    }

     */

    public static void printSortedByTitle(Book[] books) {


    }

    public static void countBooksPerAuthor(Book[] books) {


    }

    public static void printBooksReleasedIn2016(Book[] books) {


    }




}

