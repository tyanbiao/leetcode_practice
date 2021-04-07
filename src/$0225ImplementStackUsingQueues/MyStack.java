package $0225ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (q1.isEmpty()) {
            q1.add(x);
            while (!q2.isEmpty()) q1.add(q2.poll());
        } else {
            q2.add(x);
            while (!q1.isEmpty()) q2.add(q1.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (!q1.isEmpty()) return q1.poll();
        if (!q2.isEmpty()) return q2.poll();
        return 0;
    }

    /** Get the top element. */
    public int top() {
        if (!q1.isEmpty()) return q1.peek();
        if (!q2.isEmpty()) return q2.peek();
        return 0;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {

    }
}
