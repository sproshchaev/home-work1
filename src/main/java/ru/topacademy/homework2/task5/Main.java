package ru.topacademy.homework2.task5;

public class Main {

    public static void main(String[] args) {
        Book first = new Book("The Book", "Famous Writer", 199, "Big Book Publisher", 1984);
        Book second = new Book("The Second Book", "Less F. Writer", 249, "The Book Publishers", 1999);

        System.out.println("First book");
        System.out.println(first + "\n");
        System.out.println("Second book");
        System.out.println(second + "\n");

        System.out.println("Title of the first book: " + first.getTitle() + "\n");


        Book firstCopy = new Book(first);
        System.out.println("Copy of the first book:");
        System.out.println(firstCopy + "\n");

        System.out.println("Copy equals first book: " + firstCopy.equals(first));
        System.out.println("Second book equals first book: " + second.equals(first));
        System.out.println();

        System.out.println("Change writer of the copy to :'Most F. Writer'");
        firstCopy.setAuthor("Most F. Writer");
        System.out.println(firstCopy + "\n");
        System.out.println("Copy equals first book: " + firstCopy.equals(first));

    }

}

