package com.company.pieces;

import com.company.Position;

public class Rock extends Piece{
    // constructor
    public Rock(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition){
        return  super.isValidMove(newPosition) &&
                newPosition.getColumn() == this.getPosition().getColumn() ||
                newPosition.getRow() == this.getPosition().getRow();
    }
}
