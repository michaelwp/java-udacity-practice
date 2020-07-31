package com.company.pieces;

import com.company.Position;

public class King extends Piece{
    // constructor
    public King(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition){
        return  super.isValidMove(newPosition) &&
                (Math.abs(newPosition.row - this.position.row) <= 1) &&
                (Math.abs(newPosition.column - this.position.column) <= 1);
    }
}
