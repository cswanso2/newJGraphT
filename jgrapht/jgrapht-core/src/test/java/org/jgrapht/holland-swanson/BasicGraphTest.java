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
	//1
	@Test
	public void getEdgeOneTest()
	{
        DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;
        g.addEdge(vertex1, vertex2, value);

        assertEquals(g.getEdge(vertex1, vertex2), value);
	}

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

        assertEquals(getEdgeWeight(getEdge(vertex1, vertex2)), 10);
	}

	@Test
	public void removeEdgeUpdateTest()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;
        g.addEdge(vertex1, vertex2, value);
        g.removeEdge(vertex1, vertex2);
        Integer update = 5;
        g.addEdge(vertex1, vertex2, update);

        assertEquals(g.getEdge(vertex1, vertex2), update);
	}

	@Test
	public void addVertexTest()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);

        assertEquals(g.addVertex(vertex1, vertex2), false);
	}
}