package org.academiadecodigo.carcrash.field;

public class Position {

    private int Col;
    private int Row;

    public Position() {
        Col = (int) Math.floor(Math.random() * Field.getWidth() + 1);
        Row = (int) Math.floor(Math.random() * Field.getHeight() + 1);
    }

    public int getCol() {
        return this.Col;
    }

    public int getRow() {
        return this.Row;
    }

    public void setCol(int col) {

        // prevent it from exiting the map
        //if(col <= 0) {
        //    this.Col += 1;
        //    return;
        //}

        Col = col;
    }

    public void setRow(int row) {

        // prevent it from exiting the map
        //if(Row <= 0) {
        //    this.Row += 1;
        //    return;
        //}

        Row = row;
    }
}
