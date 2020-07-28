package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    // defined file
        File file = new File("FairAndWarmer.txt");
        // define file scanner
        Scanner scanner = new Scanner(file);
        // define default number of words
        int wordsCount = 0;
        // loop the files content line by line
        while (scanner.hasNextLine()){
            // read the line
            String line = scanner.nextLine();
            // split and get the length of the words in a sentences
            int wordsLength = line.split(" ").length;
            // add up the wordsCount with the wordsLength
            wordsCount += wordsLength;
        }
        // display the result
        System.out.println("Number of words in the file: " + wordsCount);

    }
}
