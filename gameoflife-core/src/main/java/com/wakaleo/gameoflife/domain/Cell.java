package com.wakaleo.gameoflife.domain;

 /**
 * Wakaleo Consulting - John Ferguson Smart
 * Game of life, demonstration application for Jenkins: The Definitive Guide
 *
 * Cell.java
 * Cell object class, contains information on individual cells (positions) in the grid
 */
// add a           comment for testing Jenkins - GMD  6Dec17
// add a second    comment for testing Jenkins - GMD  7Dec17
// add a third     comment for testing Jenkins - GMD  8Dec17
// add a fourth    comment for testing Jenkins - GMD 29Dec17
// add a fifth     comment for testing Jenkins - GMD 29Dec17
// add a sixth     comment for testing Jenkins - GMD 23Jan18
// add a seventh   comment for testing Jenkins - GMD 23Jan18
// add an eighth   comment for testing Jenkins - GMD 23Jan18
// add a ninth     comment for testing Jenkins - GMD 24Jan18
// add a tenth     comment for testing Jenkins - GMD 30Jan18  
// add an eleventh comment for testing Jenkins pipeline web-hook in AWS - GMD 23Aug19
//
public enum Cell {
	// Symbols to represent cell status
    LIVE_CELL("*"), DEAD_CELL(".");


    private String symbol;

    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

	// Override function for easy printing of cell's symbol
	// Functions identically to default getter ( getSymbol() )
    @Override
    public String toString() {
        return symbol;
    }

	// Function used for creating a cell given a string
    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

	// Default getter
    public String getSymbol() {
        return symbol;
    }
}
