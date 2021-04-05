package LinkedList;

public class SingleLink {
    public Node head;

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {return this.data;}
        public Node getNext() {return this.next;}
    }

    public void displayList(Node headNode) {
        Node temp = new Node(headNode.getData());
        temp.setNext(headNode.getNext());
        while(temp.getNext() != null) {
            System.out.println("Data: " + temp.getData() + "\nNext: " + temp.getNext());
            temp.setData(temp.getNext().getData());
            temp.setNext(temp.getNext().getNext());
        }
        System.out.println("Data: " + temp.getData() + "\nNext: " + temp.getNext());
    }
}
