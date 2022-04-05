public class Node<T> {

    public T data; //an element which the node contains
    public Node<T> next; //points to the next element

    //Creating a node with its own data and a pointer to another type of node called n.
    public Node(T e, Node<T> n) {
        this.data = e;
        this.next = n;
    }

    //retrieve the data on the node
    public T getData() {
        return data;
    }

    //setting the data
    public void setData(T data) {
        this.data = data;
    }

    //get the next node
    public Node<T> getNext() {
        return next;
    }

    //setting the next function
    public void setNext(Node<T> n) {
        this.next = n;
    }

}