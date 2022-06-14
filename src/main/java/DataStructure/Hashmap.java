package DataStructure;

public class Hashmap {

    private int size;
 private myArrayList values = new myArrayList();
 private mySet keys = new mySet();



    public boolean isEmpty() {
        return true;
    }


    public void put(Object key , String value) {

        for (int i = 0; i < keys.size(); i++) {
            if (key.equals(keys.get(i))){
                for (int j = 0; j < values.getSize(); j++) {
                    values.set(i, value);
                }
               // values.add(value);
            }

        }
        size++;

}







    public int size() {

        return size;
    }

    public String replace(String value) {
        keys.add(value);
        return value;
    }


    public Object get(Object key) {
        for (int i = 0; i <keys.size() ; i++) {
            if (key.equals(keys.get(i))){
                return values.get(i);
            }
        }
        return null;


    }
}




