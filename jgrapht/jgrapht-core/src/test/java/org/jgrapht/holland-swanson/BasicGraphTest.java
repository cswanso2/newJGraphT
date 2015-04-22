//Added by Brandon Holland

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
	public void getEdgeTest()
	{
		DirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		String vertex1 = "1";
        g.addVertex(vertex1);
        String vertex2 = "2";
        g.addVertex(vertex2);
		Integer value = 3;
        g.addEdge(vertex1, vertex2, value);
        Integer test = g.getEdge(vertex1, vertex2);
        assertEquals(test, value);
	}
}