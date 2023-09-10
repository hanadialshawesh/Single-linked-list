package org.example;

class Node <U> { // class Node with generic data type to enter any data type
    private U data;   // every node have "data,next" |..."...|
    private Node<U> next;

      public Node (U data){
          this.data = data;
          this.next = null;
      }

      public void setData(U data) {
          this.data = data;
      }

      public void setNext(Node<U> next) {
          this.next = next;
      }

      public U getData(){
          return this.data;
      }
      public Node<U> getNext(){
          return this.next;
      }
}

public class Linkedlist<U> {  // In linked list you have a head and a tail
    private Node<U> head;
    private Node<U> tail;
    private int size;


    // access private field using public getter method

    public Linkedlist() { //both of them are empty yet
        this.head = null;
        this.tail = null;
    }

    public void addFirst(U data) {  // add a number at first-->
        Node<U> node = new Node<U>(data);  //new node
        node.setNext(this.head); // swap the node with a head
        this.head = node;
        this.size++; // increase the size
    }

    public void addLast(U data) {
        Node<U> node = new Node<U>(data); // make new tail
        node.setNext(null);

        //increase the size
        if (this.head == null) {
            this.head = node;
        }

        else {
            Node<U> current = this.head; //It's Like walking until you find a tail and put a node

            while (current.getNext() != null){
                current = current.getNext();}

            current.setNext(node);  // add a node in the null of the tail
        }

        this.size++;
    }

    public void deleteFirst() {
        if (this.head != null) {
            this.head = this.head.getNext();    // make the arrow to next head
            this.size--;
        }

        else
            System.out.println("LinkedList is empty");
    }

    public void deleteLast() {
        if (this.head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        else if (this.head.getNext() == null) { // if the next of the next head is null
            this.head = null; //swap and making it the head
            this.size--; //decrease the size
        }

        else {
            Node<U> current = this.head;

            while (current.getNext().getNext() != null) // walking until we find if the next of the next of the next head is null
                current = current.getNext();

            current.setNext(null);
            this.size--;
        }
    }

    public void deleteNode(U value) { // delete a value "node"
        if (this.head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        else if (this.head.getData() == value) {
            this.head = this.head.getNext();// when it's just one number the process is swap the data to the null
            System.out.println("LinkedList is empty now :) ");
            this.size--;
        }

        else {
            Node<U> current = this.head;

            while (current.getNext() != null) { //to delete when u have more than number in Linked list
                if (current.getNext().getData() == value) {
                    current.setNext(current.getNext().getNext().getNext()); // skip the number that u wanna to delete and swap the ..next with .. next.next
                    this.size--;
                    break;
                }

                else
                    current = current.getNext(); //delete the last value
            }
        }
    }

    public int size() {
        return this.size; /* to show the size */
    }

    public void printLinkedList() {
        Node<U> current = this.head; // print the node

        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext(); // update the node
        }

        System.out.print("\n");
    }
}
