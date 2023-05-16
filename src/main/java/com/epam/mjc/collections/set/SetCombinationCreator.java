package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        for (String word : secondSet) {
            if (firstSet.contains(word) && !thirdSet.contains(word)) {
                result.add(word);
            }
        }
        for (String word : thirdSet) {
            if (!firstSet.contains(word) && !secondSet.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }
}
