package com.company.pieces;

import com.company.Position;

public class Bishop extends Piece {

    // constructor
    public Bishop(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition){
        return  Math.abs(newPosition.column - this.position.column) ==
                Math.abs(newPosition.row - this.position.row);
    }
}
