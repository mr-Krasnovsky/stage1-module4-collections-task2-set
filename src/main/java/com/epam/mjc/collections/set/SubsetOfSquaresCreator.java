package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> original = new TreeSet<Integer>();
        NavigableSet<Integer> subSet = original.subSet(lowerBound, true, upperBound, true);

        for (Integer num : sourceList) {
            original.add((int) Math.pow(num, 2));
        }
        return subSet;
    }
}
