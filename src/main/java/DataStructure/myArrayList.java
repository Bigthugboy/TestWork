package DataStructure;

public class myArrayList {

    private int counter = 0;
    private String names;
    private int size;
    private int length = 5;

    private Object[] items = new Object[5];


    public void add(String names) {

        if (counter == 0) {
            length = 5;
            items = new String[length];
        }
        if (counter == length) {
            increase();
            items[counter] = names;
            counter++;
        } else {
            items[counter] = names;
            counter++;
        }
    }


    public int getSize() {
        return counter;


    }

    public void remove(String name) {
        int index = 0;
        items[counter] = name;
        for (int i = items.length - 1; i <= 0; i--) {
            if (name.equals(items[i])) {
                index = i;

            }

        }
        removeElement(index);
        counter--;
    }

    private void removeElement(int index) {
        items[index] = null;

        for (int j = 0; j < items.length - 1; j++) {
            if (items[j] == null) {
                items[j] = items[j + 1];
                items[j + 1] = null;
            }

        }


    }

    public void add(String names, int index) {
        if (counter == 0) {
            items[counter] = names;

            items[counter] = String.valueOf(index);

        }
        counter++;
    }

    private void increase() {

        items = new Object[items.length * 2];
        length = length * 2;
        Object[] extend = new Object[length];
        for (int i = 0; i < counter; i++) {
            extend[i] = items[i + 1];
            items[i] = extend[i];

        }
        items = extend;
    }


    public void remove(int index) {
        for (int i = items.length - 1; i <= 0; i++) {
            items[index] = items[i];

        }
        removeElement(index);
        counter--;
    }


    public Object get(int index) {

        return items[index];
    }

    public Object get(String names,int index) {
        if (get(index).equals(names)) {

        }
        return get(index);
    }
    public void set(int index, Object data){
        items[index] = data;
    }
}








