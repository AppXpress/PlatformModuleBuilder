package com.gtnexus.pmm.pmdocgen.renderer.excel.traversal;

public class Coord {

    private int row;
    private int col;

    public Coord() {
	this(0, 0);
    }

    public Coord(int row, int col) {
	this.row = row;
	this.col = col;
    }

    public int getRow() {
	return row;
    }

    public void setRow(int row) {
	this.row = row;
    }

    public void incrementRow() {
	this.row++;
    }

    public void incrementCol() {
	this.col++;
    }

    public int getCol() {
	return col;
    }

    public void setCol(int col) {
	this.col = col;
    }

    public boolean isOrigin() {
	return row == 0 && col == 0;
    }

}