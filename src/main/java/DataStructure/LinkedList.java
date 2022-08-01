package DataStructure;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("italy");
        list.add(2);
        list.add(5);
        list.add(53);
        list.add(88);
        list.add(9);
        list.add(6);
        list.add(0);
//        list.addStart(599);
       list.removeFirst();
        list.get(2);
        list.deleteLast();


        list.display();
    }
}
