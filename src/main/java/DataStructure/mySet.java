package DataStructure;

import java.util.ArrayList;
import java.util.Objects;

public class mySet {
    private int counter = 0;



    ArrayList <Object> list = new ArrayList<>();


    public void add(Object name) {

        if (!contains(name)){
            list.add(name);
             counter++;
        }
    }
    public boolean contains(Object value){
        for (int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return true;
    }

    public Object get(int index) {
        return list.get(index);
    }

    public Object get(Object name, int index) {
        if (Objects.equals(get(index), name)) {
            return name;
        }
        return null;
    }

    public int size() {
        return counter;
    }

    public void remove(int index) {
        list.remove(index);
        counter--;
    }
    public void remove(Object name){
      list.remove(name);
      counter--;
        }

    public void duplicate(Object name) {
            for (int i = 0; i < list.size(); i++) {
                if (list.contains(name)){
                    System.out.println("contains");
                }
                else add(name);






            }
        }
    }


