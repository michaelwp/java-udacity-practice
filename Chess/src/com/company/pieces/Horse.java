package com.company.pieces;

import com.company.Position;

public class Horse extends Piece {
    // constructor
    public Horse(Position firstPosition) {
        super(firstPosition);
    }

    // overrides the is valid move method
    public boolean isValidMove(Position newPosition) {
        return ((Math.abs(newPosition.row - this.position.row) == 2) &&
                (Math.abs(newPosition.column - this.position.column) == 1)) ||
               ((Math.abs(newPosition.row - this.position.row) == 1) &&
                (Math.abs(newPosition.column - this.position.column) == 2));
    }
}
