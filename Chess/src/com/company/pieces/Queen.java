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
                (Math.abs(newPosition.getColumn() - this.getPosition().getColumn()) ==
                Math.abs(newPosition.getRow() - this.getPosition().getRow())) ||
                (newPosition.getColumn() == this.getPosition().getColumn() ||
                newPosition.getRow() == this.getPosition().getRow());
    }
}
