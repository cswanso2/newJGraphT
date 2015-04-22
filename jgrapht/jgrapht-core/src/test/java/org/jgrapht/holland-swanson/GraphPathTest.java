// Added by Brandon Holland

package org.jgrapht.alg;

import java.io.*;
import java.util.*;

import junit.framework.*;

import org.jgrapht.*;
import org.jgrapht.graph.*;

public class GraphPathTest
{

    // Converted JUnit 4 test from testRaidus() in the ClosestFirstIteratorTest class
	@Test
	public void testgetWeight()
	{
		int nbPaths = 5;

        KShortestPathCompleteGraph4 graph = new KShortestPathCompleteGraph4();

        KShortestPaths pathFinder = new KShortestPaths(graph, "vS", nbPaths);
        List pathElements = pathFinder.getPaths("v3");

        GraphPath pathElement = (GraphPath) pathElements.get(0);
        assertEquals(2, pathElement.getWeight(), 0);

	}
	
}