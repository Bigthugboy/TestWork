package DataStructure;

public class MyLinkedList {
    private  Node node;
    private Node head;
    private Node tail;
    private  Node next;
    private int counter;
    private int size;



    public boolean isEmpty(){
        return true;
    }

    public void add(Object data) {

        Node node = new Node(data);

        if (head == null){
            head = node;
            tail = head;
        }else {
           // tail = new Node(data);
            tail.next = node;
            tail = node;
        }
        counter++;
    }

    public int size() {
        return counter;
    }

    public void addStart(Object data) {
        Node node = new Node(data);
        Node temp = head;
        head = node;
        head.next = temp;

    }


    public void removeFirst() {
        head = head.next;
        if(head == null){
            tail = null;
            counter--;
        }

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;

        }

        return node;
    }
    public void deleteLast(){
        if(size() <= 1){
            deleteLast();
        }
        Node last = get(counter - 2);
        Object data = tail.data;
        tail = last;
        tail.next =  null;

    }
}




