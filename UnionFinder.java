/*
* Friends School adaptation of a lab by Robert Sedgewick described at
* https://introcs.cs.princeton.edu/java/24percolation/
*
*
* (c) 2021 Joel Hammer, Friends School of Baltimore.
*/

/**
* Specifies the methods necessary for a solution to the dynamic
* connectivity problem (without the possiblity of removal of connections).
* The interface assumes a graph of initially completely disconnected nodes
* which may be successively conected.
*
* The pricipal purpose of such a class is to determine if any two nodes are
* connected either <i>directly</i> or <i>indirectly</i> through connections.
* to intermediate nodes.
* 
* The method {@code union(a,b)} <i> directly </i> connects to nodes, but
* any two nodes are said to be connected if a series of direct connections
* exist. For example, if node a is connected to node b directly and node b
* is directly connected to node c, then node a is connected to node c <i>
* indirectly </i>.
*
* The {@code find(a,b)} method determines nodes a and be are connected
* either directly or indirectly.
*/
public interface UnionFinder {
	
	/**
    * Connects two given nodes.
    *
    * @param a the first node to be connected.
    * @param b the second node to be connected.
    */
    public void union(int a, int b);
	
	/**
    * Determines if a connection between node a and node b exists.
    * @param a the first node to be checked.
    * @param b the second node to be checked.
    */
    public boolean find(int a, int b);
}