/*
* Friends School adaptation of lab by Robert Sedgwick described at
* https://introcs.cs.princeton.edu/java/24percolation/
*
*
* (c) 2021 Joel Hammer, Friends School of Baltimore
*/


/**
* This interface describes the required methods for a percolation system designed to 
* run a Monte Carlo simulation to determine the percolation threshold of an n x n grid.
* It assumes a matrix of n x n sites, initially closed, but which may be sequentially
* opened (but never closed). It considers that water flows from the top of the matrix
* and detects:
* <ol type = "1">
* <li> Whether water flows to any given site from the top and </li>
* <li> Whether the system percolates. That is, water can flow from
* the top through open sites to the bottom of the system </li></ol>
*
* Water can flow from one site to the next <b> only </b> if they share a border, so
* that water cannot pass directly between two squares joining only at the corner.
*/
public interface Percolation {
	
	/**
	* Opens the site at the given row column in the percolation matrix. Note that
	* the uppermost row should be numbered "1" and the leftmost column also numbered
	* "1." Additionally, it is important to note that this method is <i>not</i>
	* {@code open(int x, int y)} where x and y represent coordinates in the plane.
	* From this perspective, the row and column would be a reversal of the expected
	* ordering.
	*
	* @param row the row in which the site to be opened is located.
	* @param col the column in which the site to be opened is located.
	*/
	public void open(int row, int col);
	
	
	/**
	*
	*/
	public boolean isOpen(int row, int col);
	
	public boolean hasWater(int row, int col);
	
	public boolean percolates();
	
}