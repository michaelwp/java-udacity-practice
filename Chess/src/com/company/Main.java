package com.company;

import com.company.pieces.*;

/**
 * Chess Game
 * Created 31072020, by Michael Putong
 */

public class Main {

    public static void main(String[] args) {
        // create instance of piece & position class
        Position piecetPosition = new Position(1, 1);
        Piece piece = new Piece(piecetPosition);

        /*
            Setup and validating the King position
         */
        // setup first king position
        Position kingFirstPosition = new Position(1, 5);
        // create instance of King class
        King king = new King(kingFirstPosition);
        // create instance of position class
        Position kingPosition = new Position(2, 4);
        // validating pieces new move
        if (!piece.isValidMove(kingPosition)) {
            // if pieces move is invalid
            System.out.println("King: " + piece.isValidMove(kingPosition) + " move");
        } else {
            // print out whether the new position is valid move or not
            System.out.println("King: " + king.isValidMove(kingPosition) + " move");
            if (king.isValidMove(kingPosition)) {
                // if valid then setup the position
                king.setupPosition(kingPosition);
            }
        }

        /*
            Setup and validating the Queen position
         */
        // setup first queen position
        Position queenFirstPosition = new Position(1, 4);
	    // create instance of queen & Piece class
        Queen queen = new Queen(queenFirstPosition);
        // create instance of position class
        Position queenPosition = new Position(8, 4);
        // validating pieces new move
        if (!piece.isValidMove(queenPosition)) {
            // if pieces move is invalid
            System.out.println("Queen: " + piece.isValidMove(queenPosition) + " move");
        } else {
            // print out whether the new position is valid move or not
            System.out.println("Queen: " + queen.isValidMove(queenPosition) + " move");
            if (queen.isValidMove(queenPosition)) {
                // if valid then setup the position
                queen.setupPosition(queenPosition);
            }
        }

        /*
            Setup and validating the Bishop position
         */
        // setup first bishop position
        Position bishopFirstPosition = new Position(1, 6);
        // create instance of bishop class
        Bishop bishop = new Bishop(bishopFirstPosition);
        // create instance of position class
        Position bishopPosition = new Position(2, 5);
        // validating pieces new move
        if (!piece.isValidMove(bishopPosition)) {
            // if pieces move is invalid
            System.out.println("Bishop: " + piece.isValidMove(bishopPosition) + " move");
        } else {
            // print out whether the new position is valid move or not
            System.out.println("Bishop: " + bishop.isValidMove(bishopPosition) + " move");
            if (bishop.isValidMove(bishopPosition)) {
                // if valid then setup the position
                bishop.setupPosition(bishopPosition);
            }
        }

        /*
            Setup and validating the Horse position
         */
        // setup first horse position
        Position horseFirstPosition = new Position(1, 2);
        // create instance of horse class
        Horse horse = new Horse(horseFirstPosition);
        // create instance of position class
        Position horsePosition = new Position(2, 4);
        // validating pieces new move
        if (!piece.isValidMove(horsePosition)) {
            // if pieces move is invalid
            System.out.println("Horse: " + piece.isValidMove(horsePosition) + " move");
        } else {
            // print out whether the new position is valid move or not
            System.out.println("Horse: " + horse.isValidMove(horsePosition) + " move");
            if (horse.isValidMove(horsePosition)) {
                // if valid then setup the position
                horse.setupPosition(horsePosition);
            }
        }

        /*
            Setup and validating the Rock position
         */
        // setup first rock position
        Position rockFirstPosition = new Position(1, 8);
        // create instance of rock class
        Rock rock = new Rock(rockFirstPosition);
        // create instance of position class
        Position rockPosition = new Position(3, 8);
        // validating pieces new move
        if (!piece.isValidMove(rockPosition)) {
            // if pieces move is invalid
            System.out.println("Rock: " + piece.isValidMove(rockPosition) + " move");
        } else {
            // print out whether the new position is valid move or not
            System.out.println("Rock: " + rock.isValidMove(rockPosition) + " move");
            if (rock.isValidMove(rockPosition)) {
                // if valid then setup the position
                rock.setupPosition(rockPosition);
            }
        }

        /*
            Setup and validating the Pawn position
         */
        // setup first pawn position
        Position pawnFirstPosition = new Position(2, 1);
        // create instance of pawn class
        Pawn pawn = new Pawn(pawnFirstPosition);
        // create instance of position class
        Position pawnPosition = new Position(3, 1);
        // validating pieces new move
        if (!piece.isValidMove(pawnPosition)) {
            // if pieces move is invalid
            System.out.println("Pawn: " + piece.isValidMove(pawnPosition) + " move");
        } else {
            // print out whether the new position is valid move or not
            System.out.println("Pawn: " + pawn.isValidMove(pawnPosition) + " move");
            if (pawn.isValidMove(pawnPosition)) {
                // if valid then setup the position
                pawn.setupPosition(pawnPosition);
            }
        }
    }
}
