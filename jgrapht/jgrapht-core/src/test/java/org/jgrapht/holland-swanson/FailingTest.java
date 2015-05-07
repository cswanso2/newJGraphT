//swanson

package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.After;
import org.junit.*;
import java.util.*;
import org.jgrapht.*;

public class FailingTest {
    // Derive an Edge Coverage test set T_E for checkItExpand such
    // that T_E does not satisfy GACC on the predicate in checkIt.
    // [TODO] Write your test set for T_E in JUnit.

    /*
    Fails because you try to add an edge where neither one is a vertex in the graph to the graph, it should just create the vertices 
    and edge and but instead the exception is thrown because the vertices are not in the grpah.
    */
    @Test
    public void EdgeWithoutVertex() {
        WeightedGraph<String, Integer> g = new SimpleWeightedGraph<String, Integer>(Integer.class);
        String vertex1 = "1";
        String vertex2 = "2";
        try
        {
            assertEquals(true, g.addEdge(vertex1, vertex2, 2));
        }
        catch(Exception e)
        {
            fail("unexpected error");
        }
        assertEquals(true, true);
    }


    /*
    When one vertex in the graph, and the other isn't and an edge is added it should add the 
    new vertex but instead nothing is added.
    */
    @Test
    public void FailsOnNoVertex()
    {
        UndirectedGraph<String, Integer> g = new SimpleGraph<String, Integer>(Integer.class);
        String vertex1 = "1";
        String vertex2 = "2";
        String vertex3 = "3";
        g.addVertex(vertex1);
        try
        {
            assertEquals(true, g.addEdge(vertex1, vertex3, 2));
        }
        catch(Exception e)
        {
            fail("unexpected error");
        }
    }
}