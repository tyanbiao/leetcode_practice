package $0155MinStack;

import edu.princeton.cs.algs4.StdOut;

public class MinStack {
    private static final int DEFAULT_SIZE = 100;

    private int topIndex;
    private int[] nums;

    public MinStack() {
        nums = new int[DEFAULT_SIZE];
        topIndex = -1;
    }

    public void push(int val) {
        // 扩容
        if (nums.length / 2 - 1 <= topIndex) {
            int[] newArr = new int[nums.length + DEFAULT_SIZE];
            System.arraycopy(nums, 0, newArr, 0, topIndex + 1);
            System.arraycopy(nums, nums.length - 1 - topIndex, newArr, newArr.length - 1 - topIndex, topIndex + 1);
            nums = newArr;
        }
        nums[++topIndex] = val;
        nums[nums.length - 1 - topIndex] = topIndex == 0 ? val : Math.min(val, nums[nums.length  - topIndex]);
    }

    public void pop() {
        topIndex = topIndex < 0 ? -1 : topIndex - 1;
    }

    public int top() {
        return topIndex >= 0 ? nums[topIndex] : 0;
    }

    public int getMin() {
        return topIndex >= 0 ? nums[nums.length - 1 - topIndex] : 0;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(0);
        stack.push(1);
        StdOut.println(stack.getMin());
        stack.pop();
        StdOut.println(stack.top());
        StdOut.println(stack.getMin());
    }
}
