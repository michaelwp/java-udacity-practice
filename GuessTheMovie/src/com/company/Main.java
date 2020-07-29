package com.company;

public class Main {

    public static void main(String[] args) {
        // create object read file
        ReadFile readFile = new ReadFile("movies.txt");
        // create object guess the title
        GuessTheTitle guessTheTitle = new GuessTheTitle(readFile.readFilesContent());
        // start to guess
        guessTheTitle.loopTheMovieList("A-Z");
    }
}
