package com.company;

import com.company.pieces.Piece;

public class GameBoard {
    // public ields
    public Piece[][] board;

    // constructor
    GameBoard() {
        // setup the default 2 dimensional board
        // value to 8 x 8 for column and row
        this.board = new Piece[8][8];
    }
}
