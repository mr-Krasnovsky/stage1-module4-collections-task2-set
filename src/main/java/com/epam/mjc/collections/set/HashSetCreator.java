package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new LinkedHashSet<>();
        for (Integer arg : sourceList) {
            result.add(arg);
            if (arg % 2 == 0) {
                while (arg % 2 == 0) {
                    arg = (arg / 2);
                    result.add(arg);
                }
            } else {
                result.add(2 * arg);
            }
        }

        return result;
    }
}
