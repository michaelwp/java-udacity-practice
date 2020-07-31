package com.company.pieces;

import com.company.Position;

public class Queen extends Piece {
    // constructor
    public Queen(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition){
        return  super.isValidMove(newPosition) &&
                (Math.abs(newPosition.column - this.position.column) ==
                Math.abs(newPosition.row - this.position.row)) ||
                (newPosition.column == this.position.column ||
                newPosition.row == this.position.row);
    }
}
