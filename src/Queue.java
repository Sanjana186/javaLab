public class Queue {
    private int [] arr;
    private int front, rear, size, capacity;
    public Queue(int capacity)
    {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int val) throws QueueOverflowException {
        if (size == capacity)
            throw new QueueOverflowException("Queue is full! overflow.");
        rear = (rear + 1)%capacity;
        arr[rear] = val;
        size++;
        System.out.println(val + "enqueued");
    }
    public void dequeue() throws QueueUnderflowException{
        if(size==0)
        {
            throw new QueueUnderflowException("Queue is empty! Underflow.");

        }
        int val = arr[front];
        front = (front+1)%capacity;
        size--;
        System.out.println("Removed element :"+val);
    }
    public void display()
    {
        if(size==0)
        {
            System.out.println("Queue is empty ");
            return;
        }
        for( int i = 0; i<size; i++)
        {
            System.out.print(arr[(front+i)%capacity]+" ");
            System.out.println();
        }
    }
}
