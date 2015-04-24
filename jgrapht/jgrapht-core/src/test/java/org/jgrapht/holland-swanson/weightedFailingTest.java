//Added by Brandon Holland

package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import org.jgrapht.*;

/*
This file contains two bugs.  They are described below:

getEdgeWeightTest: When passing in an integer for the edge value, we would want to expect an integer to be outputted when calling getEdgeWeight.  Instead it gives a double and thus fails.

unweightedGraphTest: The output of getEdgeWeight is supposed to ouput 1.0 by the documentation, but also fails when compairing it to 1.0.
*/

public class weightedFailingTest
{
	@Test
	public void getIntEdgeWeightTest()
	{
		WeightedGraph<String, Integer> g = new SimpleWeightedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 10;
        g.addEdge(vertex1, vertex2, value);

        assertEquals(g.getEdgeWeight(g.getEdge(vertex1, vertex2)), 10.0);
	}

	@Test
	public void unweightedGraphTest()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 10;
        g.addEdge(vertex1, vertex2, value);

        assertEquals(g.getEdgeWeight(g.getEdge(vertex1, vertex2)), 1.0);
	}

	@Test
	public void getBoolEdgeWeightTest()
	{
		WeightedGraph<String, Boolean> g = new SimpleWeightedGraph<String, Boolean>(Boolean.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Boolean test = true;
        g.addEdge(vertex1, vertex2, test);

        assertEquals(g.getEdgeWeight(g.getEdge(vertex1, vertex2)), true);
	}
}