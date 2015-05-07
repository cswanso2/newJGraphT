//Added by Brandon Holland

package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;

public class BasicGraphTest
{
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
	public void addVertexFalseTest()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);

        assertEquals(g.addVertex(vertex1), false);
	}

	@Test
	public void addVertexTrueTest()
	{
		UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";

        assertEquals(g.addVertex(vertex2), true);
	}

	@Test
	public void containsEdgeTrueTest()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;
        g.addEdge(vertex1, vertex2, value);

        assertEquals(g.containsEdge(vertex1, vertex2), true);
	}

	@Test
	public void containsEdgeFalseTest()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;
        g.addEdge(vertex1, vertex2, value);
        String vertex3 = "3";
        g.addVertex(vertex3);

        assertEquals(g.containsEdge(vertex1, vertex3), false);
	}

	@Test
	public void addEdgeTrue()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;

        assertEquals(g.addEdge(vertex1, vertex2, value), true);
	}

	@Test
	public void addEdgeFalse()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;
        g.addEdge(vertex1, vertex2, value);
        Integer update = 5;

        assertEquals(g.addEdge(vertex1, vertex2, update), false);
	}

	@Test
	public void getEdgeSourceTest()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;
        g.addEdge(vertex1, vertex2, value);

        assertEquals(g.getEdgeSource(g.getEdge(vertex1, vertex2)), vertex1);
	}

	@Test
	public void getEdgeTargetTest()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 3;
        g.addEdge(vertex1, vertex2, value);

        assertEquals(g.getEdgeTarget(g.getEdge(vertex1, vertex2)), vertex2);
	}

        
        //Test Undirected Graph Builder
        @Test
        public void testUndirectedGraphBuilder()
        {
                UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

                UndirectedGraphBuilder(g);

                String vertex1 = "1";
                g.addVertex(vertex1);
                String vertex2 = "2";

                assertEquals(g.addVertex(vertex2), true);
        }
}