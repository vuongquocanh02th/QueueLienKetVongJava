public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        //
        queue.displayQueue();
        //
        queue.dequeue();
        queue.dequeue();
        //
        queue.displayQueue();
    }
}