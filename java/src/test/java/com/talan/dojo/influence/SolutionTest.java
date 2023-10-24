package com.talan.dojo.influence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    @DisplayName("simple example")
    void simpleExample() {

        int[][] relations = new int[][] {
                new int[] {1, 2},
                new int[] {1, 3},
                new int[] {3, 4},
        };

        Assertions.assertEquals(3, Solution.mostLongSuccessionOfInfluence(Arrays.stream(relations).toList()));

    }

    @Test
    @DisplayName("simple complete")
    void simpleComplete() {

        int[][] relations = new int[][] {
                new int[] {1, 2},
                new int[] {1, 3},
                new int[] {3, 4},
                new int[] {2, 4},
                new int[] {2, 5},
                new int[] {10, 11},
                new int[] {10, 1},
                new int[] {10, 3},
        };

        Assertions.assertEquals(4, Solution.mostLongSuccessionOfInfluence(Arrays.stream(relations).toList()));
    }

    @Test
    @DisplayName("most common")
    void mostCommon() {

        int[][] relations = new int[][] {
                new int[] {2, 3},
                new int[] {8, 9},
                new int[] {1, 2},
                new int[] {6, 3},
        };

        Assertions.assertEquals(3, Solution.mostLongSuccessionOfInfluence(Arrays.stream(relations).toList()));
    }

    @Test
    @DisplayName("most common 2")
    void mostCommon2() {

        int[][] relations = new int[][] {
                new int[] {7, 2},
                new int[] {8, 9},
                new int[] {1, 6},
                new int[] {6, 9},
                new int[] {1, 7},
                new int[] {1, 2},
                new int[] {3, 9},
                new int[] {2, 3},
                new int[] {6, 3},
        };

        Assertions.assertEquals(5, Solution.mostLongSuccessionOfInfluence(Arrays.stream(relations).toList()));
    }
}
