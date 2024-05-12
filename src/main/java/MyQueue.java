public class MyQueue {

        private static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node front;
        private Node rear;

        public MyQueue() {
            front = null;
            rear = null;
        }

        public void push(int v) {
            Node newNode = new Node(v);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }

            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }

        public boolean isEmpty() {
            return front == null;
        }
}

