package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import org.jgrapht.*;

public class SecondVertex {
    // Derive an Edge Coverage test set T_E for checkItExpand such
    // that T_E does not satisfy GACC on the predicate in checkIt.
    // [TODO] Write your test set for T_E in JUnit.

    @Test
    public void addedSecondVertex() {
        UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
        String vertex1 = "2";
        g.addVertex("1");
        String vertex2 = "2";
        g.addVertex(vertex2);
        g.addEdge(vertex1, "2");
        assertEquals(2, g.vertexSet().size());
    }
}