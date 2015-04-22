//swanson

package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import org.jgrapht.*;

public class FailingTests {
    // Derive an Edge Coverage test set T_E for checkItExpand such
    // that T_E does not satisfy GACC on the predicate in checkIt.
    // [TODO] Write your test set for T_E in JUnit.

    @Test
    public void EdgeWithoutVertex() {
        WeightedGraph<String, Integer> g = new SimpleWeightedGraph<String, Integer>(Integer.class);
        String vertex1 = "1";
        String vertex2 = "2";
        assertEquals(true, g.addEdge(vertex1, vertex2, 2));
    }

    @Test
    public void FailsOnNoVertex()
    {
        UndirectedGraph<String, Integer> g = new SimpleGraph<String, Integer>(Integer.class);
        String vertex1 = "1";
        String vertex2 = "2";
        g.addVertex(vertex1);
        g.addVertex(vertex2);
        String vertex3 = "3";
        assertEquals(true, g.containsEdge(vertex1, vertex3));
    }
}