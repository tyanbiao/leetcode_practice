package com.leetcode.kit;

import java.util.Arrays;

public class Tool {
    public static <T> String arrayToString(T[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (T item : arr) {
            sb.append(item);
            sb.append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }

    public static Integer[] intsToIntegers(int[] arr) {
        return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }
}
