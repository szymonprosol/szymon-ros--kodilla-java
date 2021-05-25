package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Jestem Szymon", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Dzień dobry", (text) -> text.toUpperCase());
        poemBeautifier.beautify("WITAJ ŚWIECIE", (text) -> text.toLowerCase());
        poemBeautifier.beautify("Zapraszam serdecznie", (text) -> text + " \ud83d\ude00");
        poemBeautifier.beautify("Bardzo mi przykro", (text) -> text + " \ud83d\ude22");
    }
}