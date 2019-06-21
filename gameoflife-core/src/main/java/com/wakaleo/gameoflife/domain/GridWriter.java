package com.wakaleo.gameoflife.domain;

 /**
 * Wakaleo Consulting - John Ferguson Smart
 * Game of life, demonstration application for Jenkins: The Definitive Guide
 *
 * GridWriter.java
 * Class for easy printing/showing of the grid contents
 */
//
// add a         comment for setting up "gogs" - GMD 26July18
// add a second  comment for setting up "gogs" - GMD 26July18
// add a third   comment for testing Jenkins pipeline web-hook in AWS - GMD 8May19
// add a fourth  comment for testing Jenkins pipeline web-hook in AWS - GMD 13June19
// add a fifth   comment for testing Jenkins pipeline web-hook in AWS - GMD 13June19
// add a sixth   comment for testing Jenkins pipeline web-hook in AWS - GMD 20June19
// add a seventh comment for testing Jenkins pipeline web-hook in AWS - GMD 21June19
//
public class GridWriter {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	// Functions returns the status of the cells in the grid as a string, for printing
    public String convertToString(final Cell[][] gridContents) {
        StringBuffer printedGrid = new StringBuffer();
	    for (Cell[] row : gridContents) {
            for (Cell cell : row) {
                printedGrid.append(cell.toString()); // Save the cell's status for printing
            }
            
			// Add seperator to denote the next row
			// Note: does not add seperator for empty rows
            if (row.length > 0) {
                printedGrid.append(LINE_SEPARATOR);
            }
        }
        return printedGrid.toString();
    }
}
