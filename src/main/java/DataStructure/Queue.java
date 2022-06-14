package DataStructure;

public class Queue {
    private int size;
private String [] queue = new String[5];


    public boolean isEmpty() {
        return true;
    }

    public void add(String name) {
        queue[size] = name;
        size++;

    }

    public int size() {

        return size;
    }

    public String peek() {
        return queue[size - 1];
    }

    public String pop() {
        String remove = queue[0];
        size--;
        for (int i = 0; i < size; i++) {
            queue[i] = queue[i+1];

        }


        return remove;
    }
}
