package com.company.pieces;

import com.company.Position;

public class Rock extends Piece{
    // constructor
    public Rock(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition){
        return  newPosition.column == this.position.column ||
                newPosition.row == this.position.row;
    }
}
