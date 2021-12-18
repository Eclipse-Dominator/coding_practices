package Leetcode;

import java.util.Stack;

public class Prob0232_implement_queue_using_stacks {

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

    class MyQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.add(x);
        }

        public int pop() {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            int ret = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.add(stack2.pop());
            }
            return ret;
        }

        public int peek() {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            int ret = stack2.peek();
            while (!stack2.isEmpty()) {
                stack1.add(stack2.pop());
            }
            return ret;
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
    }
}
