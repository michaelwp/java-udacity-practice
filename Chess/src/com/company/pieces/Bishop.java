package com.company.pieces;

import com.company.Position;

public class Bishop extends Piece {

    // constructor
    public Bishop(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition){
        return  super.isValidMove(newPosition) &&
                Math.abs(newPosition.getColumn() - this.getPosition().getColumn()) ==
                Math.abs(newPosition.getRow() - this.getPosition().getRow());
    }
}
