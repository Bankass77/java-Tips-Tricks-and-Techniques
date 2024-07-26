package com.java.trips.tricks.and.techniques.java9.FlowApi;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

/**
 * Publisher : Un éditeur de données. Il publie ou émet des éléments de données à des abonnés.
 */
public class BookPublisher {

    public static void main(String[] args) throws InterruptedException {
        List<Book> books = Arrays.asList(new Book[] { new Book(101, "Java 8 to 17"), new Book(102, " Java 17"), new Book(103, " The Earth") });

        SubmissionPublisher<Book> bookPublisher = new SubmissionPublisher<>();
        BookSubcriber bookSubcriber = new BookSubcriber("Dave");
        BookSubcriber bookSubcriber2 = new BookSubcriber("John");
        BookSubcriber bookSubcriber3 = new BookSubcriber("Jane");
        bookPublisher.subscribe(bookSubcriber);
        bookPublisher.subscribe(bookSubcriber2);
        bookPublisher.subscribe(bookSubcriber3);

        // submit() method:
        System.out.println("Using submit method(): ==>");
        books.stream().forEach(book -> {
            bookPublisher.submit(book);
            try {
                Thread.sleep(3000);  // Pause du Thread en cours d'execution, pour attendre le traitement des messages
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        });

        // offer() method: simple form
        System.out.println("Using offer method(): ==>");
        books.stream().forEach(book -> {
            bookPublisher.offer(book, null);
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        });

        // offer() method : timeout implementation
        books.stream().forEach(book -> {
            System.out.println(book + " " + "being offered");
            final int result = bookPublisher.offer(book, 2, TimeUnit.MILLISECONDS, (subscriber, book1) -> {
                try {
                    Thread.sleep(3000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            });
            if(result > 1) {
                System.out.println("Dropping" + " " +result + " " +"book.");
            }
        });

    }
}
