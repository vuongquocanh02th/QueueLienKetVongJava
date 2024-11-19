public class Queue {
    Node front, rear;

    public Queue() {
        front = rear = null;
    }

    //Them phan tu vao hang doi
    public void enqueue(int value) {
        Node newNode = new Node(value);
        //Neu hang doi trong, gan front va rear tro den node moi
        if (front == null) {
            front = rear = newNode;
            rear.link = front; //Lien ket rear voi front (circular)
        } else {
            rear.link = newNode; //Lien ket rear hien tai voi node moi
            rear = newNode;  //Cap nhat rear den node moi
            rear.link = front; //Lien ket rear voi front de duy tri vong tron
        }
        System.out.println(value + " added to queue");
    }

    //Loai bo phan tu o dau hang doi
    public void dequeue() {
        //Kiem tra neu hang doi trong
        if (front == null) {
            System.out.println("queue is empty, cannot dequeue!");
            return;
        }
        //Neu chi co mot phan tu trong hang doi
        if (front == rear) {
            System.out.println("Element " + front.data + " get out of queue");
            front = rear = null; //xoa node va cap nhat lai front va rear
        } else {
            Node temp = front;
            System.out.println("Element " + front.data + " get out of queue");
            front = front.link; //Di chuyen front den node tiep theo
            rear.link = front; //Cap nhat lien ket vong tron
            temp.link = null; //Cat lien ket voi node da lay ra
        }
    }

    //Hien thi tat ca phan tu trong hang doi
    public void displayQueue() {
        //Kiem tra neu hang doi trong
        if (front == null) {
            System.out.println("queue is empty, cannot display!");
            return;
        }
        Node temp = front;
        System.out.print("Current queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front); //Duyet qua tat ca phan tu trong danh sach lien ket
        System.out.println();
    }
}
