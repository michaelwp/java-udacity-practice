package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheTitle {
    // define the private list
    private final ArrayList<String> titleList;
    private final int titleListLength;
    private String regexStr = "^\\s";
    private int titleNumber = 0;
    private int guessNumber = 10;

    // constructor
    public GuessTheTitle(ArrayList<String> titleList) {
        this.titleList = titleList;
        this.titleListLength = titleList.size();
    }

    // split the title
    private String[] splitTitle(String title) {
        //remove white space and return the splitTitle array list
        return title.toUpperCase().split("");
    }

    // reset all the private list value
    private void resetAllListValus() {
        this.regexStr = "^\\s";
        System.out.println("\n");
    }

    // Loop the list and guess the movie title
    public void loopTheMovieList(String regex) {
        // define scanner
        Scanner scanner = new Scanner(System.in);

        // loop the title list
        while (this.titleNumber < titleListLength) {
            // check if win
            this.isWinOrLose();

            // split title and replace the unanswered char with "-" character
            String[] splitTitle = this.splitTitle(
                    titleList.get(titleNumber)
                            .replaceAll("[" + regex + "]", "_")
            );

            // join and print out the split title and show the existed char
            System.out.println(String.join(" ", splitTitle));

            // check if all character is completed answered
            if (this.isCharCompleted(String.join("", splitTitle), this.titleNumber)) {
                // add 1 to the title number
                this.titleNumber++;
                // check if win
                this.isWinOrLose();
                // print out the alert
                System.out.println("Correct !, guess the next movies title");
                // reset the all the private list value
                this.resetAllListValus();
                // self invoking
                loopTheMovieList(this.regexStr);
            }

            // define the guess character
            String guessChar = scanner.nextLine();

            // add new char rule in the regex str
            this.regexStr = this.regexStr + "," + guessChar.toUpperCase();

            // is char exist in the title
            boolean isExist = this.charPos(guessChar, titleList.get(titleNumber)).size() > 0;
            if (isExist) {
                // if exist
                this.regexStr = this.regexStr + "," + guessChar.toUpperCase();
            } else {
                // if not exist
                System.out.println("You have " + (this.guessNumber -= 1) + " guesses left !");
            }

            // self invoking
            loopTheMovieList(this.regexStr);
        }
    }

    // check if win or lose
    private void isWinOrLose() {
        // if lose
        if (this.guessNumber == 0) {
            System.out.println("GAME OVER !");
            System.exit(0);
        }

        // if correct or win
        if (this.titleNumber > (this.titleListLength - 1)) {
            System.out.println("YOU WIN !");
            System.exit(0);
        }
    }

    // check if the all the character completed answered
    private boolean isCharCompleted(String title, int index) {
        // return true or false
        return titleList.get(index).equals(title);
    }

    // check the char position in movie title
    private ArrayList<Integer> charPos(String titleChar, String title) {
        // split title
        String[] splitTitle = this.splitTitle(title);
        // define charpos array
        ArrayList<Integer> charPos = new ArrayList<Integer>();

        // check if char is exist
        if (!title.contains(titleChar.toUpperCase())) {
            return charPos;
        }

        // define line
        int line = 0;

        // loop the split title to find the char position
        for (String c : splitTitle) {
            line++;
            if (c.equals(titleChar.toUpperCase())) {
                charPos.add(line);
            }
        }

        // return the char pos
        return charPos;
    }
}
