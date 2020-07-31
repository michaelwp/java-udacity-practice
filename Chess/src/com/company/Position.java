package com.company;

public class Position {
    // public fields
    private int row;
    private int column;

    // constructor
    public Position(int row, int column) {
        // setup the row & column value
        this.row = row;
        this.column = column;
    }

    /* positions setter */
    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    /* positions getter */
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
