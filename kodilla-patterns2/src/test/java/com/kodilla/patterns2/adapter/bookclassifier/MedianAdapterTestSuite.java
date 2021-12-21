package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.SalaryAdapter;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Book book1 = new Book("Author1", "Title1", 2001, "Signature1");
        Book book2 = new Book("Author2", "Title2", 2002, "Signature2");
        Book book3 = new Book("Author3", "Title3", 2003, "Signature3");
        Book book4 = new Book("Author4", "Title4", 2004, "Signature4");
        Book book5 = new Book("Author5", "Title5", 2005, "Signature5");

        Set<Book> bookSet = new HashSet<>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int median = medianAdapter.publicationYearMedian(bookSet);
        // Then
        System.out.println(median);
        assertEquals(median, 2003);
    }
}
