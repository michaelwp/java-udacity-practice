package com.company.pieces;

import com.company.Position;

public class Pawn extends Piece{
    // constructor
    public Pawn(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition) {
        return  super.isValidMove(newPosition) &&
                ((newPosition.getRow() - this.getPosition().getRow()) == 1) &&
                (newPosition.getColumn() == this.getPosition().getColumn());
    }
}
