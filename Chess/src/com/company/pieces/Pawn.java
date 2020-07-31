package com.company.pieces;

import com.company.Position;

public class Pawn extends Piece{
    // constructor
    public Pawn(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition) {
        return ((newPosition.row - this.position.row) == 1) &&
               (newPosition.column == this.position.column);
    }
}
