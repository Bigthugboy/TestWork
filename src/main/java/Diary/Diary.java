package Diary;

import java.util.ArrayList;

public class Diary {
    public boolean lock;

    private String password;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String password) {
        this.password = password;
    }

    public void createEntry(String title, String body){
        Entry entry = new Entry(title, body);
        entries.add(entry);
    }
    public int getNumberOfEntries(){
        return entries.size();
    }
    public int findEntry( String title) {

        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)) {

                System.out.println(title);
                return (i + 1);
            }
        }
         return -1;
    }

    public void deleteEntry(String title) {

             entries.remove(findEntry(title) - 1);

        }


    public boolean lock() {
        return true;
    }
    public boolean unLock(String password){
        if(this.password.equals(password)){
            lock = false;
            return true;
        }
        return false;
    }
    public void lock(String password){lock = false;}





}
