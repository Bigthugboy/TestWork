package DataStructure;

public class MyLinkedList {
    private  Node node;
    private Node head;
    private Node tail;
    private  Node next;
    private int counter;



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


    public void remove(int index) {
        if(index == 0){
            head = head.next;
    }
        else {
            for (int i = 0; i < index-1 ; i++) {
                tail = tail.next;
            }
        }
    }

    public Object get(Object data) {

        return data;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}




