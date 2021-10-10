package com.kodilla.spring.reader;

public final class Reader {

    private final Book book;

    public Reader(final Book theBook) {
        this.book = theBook;
    }

    public String read() {
        return "Reading: " + book.getTitle();
    }
}