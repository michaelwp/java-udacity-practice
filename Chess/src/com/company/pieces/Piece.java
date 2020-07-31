package com.company.pieces;

import com.company.Position;

public class Piece {
    // public field
    private Position position;

    // constructor
    public Piece(Position firstPosition){
        this.position = new Position(firstPosition.getRow(), firstPosition.getColumn());
    }

    // check if the move is valid
    public boolean isValidMove(Position newPosition) {
        // will return true or false
        return newPosition.getRow() > 0 &&
                newPosition.getColumn() > 0 &&
                newPosition.getRow() <= 8 &&
                newPosition.getColumn() <= 8;
    }

    // setup the position
    public void setupPosition(Position newPosition) {
        this.position.setRow(newPosition.getRow());
        this.position.setColumn(newPosition.getColumn());
    }

    // positions getter
    public Position getPosition() {
        return position;
    }
}
