package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import org.jgrapht.*;

public class SimpleGraphTest
{

	@Test
	public void oneEdge()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
        String vertex1 = "2";
        g.addVertex("1");
        String vertex2 = "2";
        g.addEdge(vertex1, vertex2);
        assertEquals(2, g.vertexSet().size());
	}

	@Test
	public void weightedGraph()
	{
		WeightedGraph<String, Integer> g = new SimpleWeightedGraph<String, Integer>(Integer.class);
        String vertex1 = "2";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addEdge(vertex1, vertex2, 2);
       	Integer edge = g.getEdge(vertex1, vertex2);
        assertEquals(2, edge);
	}	
}