package org.jgrapht.graph;

import org.jgrapht.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import org.jgrapht.*;

public class KuhnMunkresMinimalWeightBipartitePerfectMatchingTest {
    // Derive an Edge Coverage test set T_E for checkItExpand such
    // that T_E does not satisfy GACC on the predicate in checkIt.
    // [TODO] Write your test set for T_E in JUnit.

    @Test
    public void EmptyClass() {
        
        assertEquals(Collections.emptySet(), new KuhnMunkresMinimalWeightBipartitePerfectMatching<VertexType, DefaultWeightedEdge>(graph, list0, list1).getMatching());
    }
}