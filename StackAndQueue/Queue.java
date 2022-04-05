class Queue {
    int key;
    Queue next;
 
    public Queue(int key) //Constructor to create a new link list node
    {
        this.key = key;
        this.next = null;
    }
}
 
class QNode { // A class to represent a queue
    QNode front;
    QNode rear;
 
    public QNode()
    {
        this.front = this.rear = null;
    }
 
    void enqueue(int key) //Method to add a key into the queue
    {
        Queue temp = new Queue(key); //Create a new node
 
        if (this.rear == null) { // If the queue is empty, then new node is front and rear both
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp; // Add the new node at the end of queue and change rear
        this.rear = temp;
    }

    void dequeue() // Method to remove an key from queue.
    {
        if (this.front == null) // If queue is empty, return NULL.
            return;
 
        QNode temp = this.front;  // Store the previous front and move front one node ahead
        this.front = this.front.next;
 
        if (this.front == null) // If front becomes NULL, then change rear also as NULL
            this.rear = null;
    }