import java.util.Stack;

public class QueueUsingStack {
    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public MyQueue() {
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            shiftS();
            return s2.pop();
        }

        public int peek() {
            shiftS();
            return s2.peek();

        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
        private void shiftS(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
        }
    }

}