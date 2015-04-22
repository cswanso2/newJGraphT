//Swanson

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
	//1
	@Test
	public void correctNumberOfEdges()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
        String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        g.addEdge(vertex1, vertex2);
        assertEquals(2, g.vertexSet().size());
	}
	//2
	@Test
	public void weightedGraph()
	{
		WeightedGraph<String, Integer> g = new SimpleWeightedGraph<String, Integer>(Integer.class);
        String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 2;
        g.addEdge(vertex1, vertex2, 2);
       	Integer edge = g.getEdge(vertex1, vertex2);
        assertEquals(value, edge);
	}
	//3
	@Test
	public void directedGraphOneEdge()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 2;
        g.addEdge(vertex1, vertex2, value);
        assertEquals(true, g.containsEdge(vertex1, vertex2));
        assertEquals(false, g.containsEdge(vertex2, vertex1));
	}	
	//4
	@Test
	public void directedGraphTwoEdges()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 2;
        g.addEdge(vertex1, vertex2, value);
        g.addEdge(vertex2, vertex1, value);
        assertEquals(true, g.containsEdge(vertex1, vertex2));
        assertEquals(false, g.containsEdge(vertex2, vertex1));
	}	
	//5
	@Test
	public void removeVertex()
	{
		DirectedGraph<String, DefaultEdge> g = new SimpleDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        assertEquals(2, g.vertexSet().size() );
  		g.removeVertex(vertex1);
  		g.removeVertex(vertex2);
        assertEquals(0, g.vertexSet().size() );
	}
	//6
	@Test
	public void emptyGraph()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
        assertEquals(0, g.vertexSet().size() );
	}
	//7
	@Test
	public void removeEdge()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        g.addEdge(vertex1, vertex2);
        g.removeEdge(vertex1, vertex2);
        assertEquals(false, g.containsEdge(vertex1, vertex2));
	}

	@Test
	public void removeVertexRemovesEdge()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        g.addEdge(vertex1, vertex2);
  		g.removeVertex(vertex1);
        assertEquals(false, g.containsEdge(vertex1, vertex2) );
	}

	@Test
	public void degreeOf()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        assertEquals(0, g.degreeOf(vertex1));
        String vertex2 = "2";
        g.addVertex(vertex2);
        g.addEdge(vertex1, vertex2);
        assertEquals(1,  g.degreeOf(vertex1));
        g.removeVertex(vertex2);
        assertEquals(0, g.degreeOf(vertex1));
	}

	@Test
	public void containsVertex()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        String vertex3 = "3";
        assertEquals(true, g.containsVertex(vertex1));
        assertEquals(false, g.containsVertex(vertex3));
	}
}