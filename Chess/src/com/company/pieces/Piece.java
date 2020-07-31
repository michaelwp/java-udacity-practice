package com.company.pieces;

import com.company.Position;

public class Piece {
    // public field
    public Position position;

    // constructor
    public Piece(Position firstPosition){
        this.position = new Position(firstPosition.row, firstPosition.column);
    }

    // check if the move is valid
    public boolean isValidMove(Position newPosition) {
        // will return true or false
        return newPosition.row > 0 &&
                newPosition.column > 0 &&
                newPosition.row <= 8 &&
                newPosition.column <= 8;
    }

    // setup the position
    public void setupPosition(Position newPosition) {
        this.position.row = newPosition.row;
        this.position.column = newPosition.column;
    }
}
