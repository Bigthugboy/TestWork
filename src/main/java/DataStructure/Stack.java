package DataStructure;

public class Stack {
    private boolean isEmpty = true;
    private int numberOfNumberElement;
    private int[] elements = new int[5];


    public boolean isEmpty() {
        if(numberOfNumberElement == 0) return isEmpty;
        else return false;
    }

    public void push(int element) {
        elements[numberOfNumberElement] = element;
        numberOfNumberElement++;
    }

    public int pop() {
        numberOfNumberElement--;
        int removed = elements[numberOfNumberElement];
        elements[numberOfNumberElement] = 0;
        return removed;
    }

    public int peek() {
        return elements[numberOfNumberElement-1];
    }
}

