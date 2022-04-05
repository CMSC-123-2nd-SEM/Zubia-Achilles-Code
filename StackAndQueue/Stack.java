public class Stack<T> {

    private Node<T> top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    //add a new data into the stack
    public void push(T data) {
        if(top == null) {
            top = new Node<>(data, null);
        }

        else {
            Node<T> n = new Node<>(data, top);
            top = n;
        }

        size++;
    }

    //remove a data from the stack
    public T pop() {
            Node<T> n = top;

            top = top.getNext();
            n.setNext(null);

            size--;

            return n.getData();
    }

    public T peek() {
            return top.getData();
    }

    public int getSize() {
        return size;
    }   
 
}