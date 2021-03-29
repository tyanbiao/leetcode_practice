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

    public static String linkListToString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        while (node != null) {
            sb.append(node.val);
            sb.append(',');
            node = node.next;
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }
}
