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
		Integer value = 3;
        g.addEdge(vertex1, vertex2, value);
        assertEquals(getEdge(vertex1, vertex2), value);
	}