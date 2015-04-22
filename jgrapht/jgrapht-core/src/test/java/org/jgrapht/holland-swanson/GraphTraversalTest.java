// Added by Brandon Holland

package org.jgrapht.traverse;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import org.jgrapht.*;

public class GraphTraversalTest
    extends AbstractGraphIteratorTest
{

    // Converted JUnit 4 test from testRaidus() in the ClosestFirstIteratorTest class
	@Test
	public void testRaidus()
	{
		result = new StringBuffer();

        DirectedGraph<String, DefaultEdge> graph = createDirectedGraph();

        AbstractGraphIterator<String, ?> iterator = new ClosestFirstIterator<String, DefaultEdge>(graph, "1", "301");

        while(iterator.hasNext())
        {
            result.append(iterator.next());
        }

        if(iterator.hasNext())
        {
            result.append(',');
        }

        assertEquals("1,2,3,5,6,7", result.toString());
	}
	
}