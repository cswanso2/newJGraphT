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
    public void EmptyClass() {
        UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
        vertex1 = "2";
        g.addVertex("1");
        vertex2 = "2";
        g.addVertex(vertex);
        g.addEdge(vertex1, "2");
        //WeightedGraph<String, DefaultEdge> graph = new SimpleWeightedGraph<String, DefaultEdge>(DefaultEdge.class);
        //List<String> list0 = new LinkedList<String>();
        //List<String> list1 = new LinkedList<String>();

        //assertEquals(Collections.emptySet(), new KuhnMunkresMinimalWeightBipartitePerfectMatching<String, DefaultWeightedEdge>(graph, list0, list1).getMatching());
        assertEquals(2, g.getAllVertices().size());
    }
}