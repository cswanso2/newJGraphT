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
	public void getEdgeTwoTest()
	{
		DirectedGraph<String, Integer> g = new SimpleDirectedGraph<String, Integer>(Integer.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
        Integer value = 10;
        g.addEdge(vertex1, vertex2, value);
        String vertex3 = "3";
        g.addVertex(vertex3);
        Integer value2 = 11;
        g.addEdge(vertex2, vertex3, value2);
        Integer value3 = 12;
        g.addEdge(vertex3, vertex1, value3);

        assertEquals(getEdgeWeight(getEdge(vertex1, vertex2)), 10);
	}
}