//Added by Brandon Holland

package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import org.jgrapht.*;

public class BasicGraphTest
{
	@Test
	public void getEdgeWeightTest()
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
}