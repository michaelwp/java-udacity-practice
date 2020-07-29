package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    // define the private field
    private final File file;

    // constructor
    public ReadFile(String filePath){
        // create new object file
        this.file = new File(filePath);
    }

    // read files content
    public ArrayList<String> readFilesContent() {
        // define array movies title
        ArrayList<String> moviesTitle= new ArrayList<>();

        try {
            // create new object scanner to read file
            Scanner scanner = new Scanner(this.file);

            // loop the file line by line
            while (scanner.hasNextLine()) {
                // convert to upper string and add movies title to array list
                moviesTitle.add(scanner.nextLine().toUpperCase());
            }
        } catch (Exception e) {
            // catch error and print out the error message
            System.out.println(e.toString());
            e.printStackTrace();
        }
        // return the movies title array list
        return moviesTitle;
    }

}
