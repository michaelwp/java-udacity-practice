package com.company.pieces;

import com.company.Position;

public class Horse extends Piece {
    // constructor
    public Horse(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition) {
        return  super.isValidMove(newPosition) &&
                ((Math.abs(newPosition.getRow() - this.getPosition().getRow()) == 2) &&
                (Math.abs(newPosition.getColumn() - this.getPosition().getColumn()) == 1)) ||
                ((Math.abs(newPosition.getRow() - this.getPosition().getRow()) == 1) &&
                (Math.abs(newPosition.getColumn() - this.getPosition().getColumn()) == 2));
    }
}
