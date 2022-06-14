package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    private MyLinkedList linkedList;
    @BeforeEach
    private void setUp(){
        linkedList = new MyLinkedList();
    }

    @Test
    void isEmpty() {
        assertTrue(true);
    }
    @Test
    public void linkListCanAdd(){
        linkedList.add("france");
        assertEquals(1,linkedList.size());
    }
    @Test
    public void MoreAdditions(){
        linkedList.add("england");
        linkedList.add("italy");
        linkedList.add("togo");
        assertEquals(3,linkedList.size());
    }
    @Test
    public void linkedListCanAddAtTheStart(){
        linkedList.add("england");
        linkedList.add("italy");
        linkedList.add("togo");
        linkedList.addStart("china");
        assertEquals(4,linkedList.size());
    }
    @Test
    public void linkedListCanRemoveObject(){
        linkedList.add("england");
        linkedList.add("italy");
        linkedList.add("togo");
        linkedList.remove(1 );
        assertEquals(3,linkedList.size());
    }
    @Test
    public void linkedListCanGet(){
        linkedList.add("england");
        linkedList.add("italy");
        linkedList.add("togo");
        linkedList.get("italy");
        assertEquals("italy",linkedList.get("togo"));
    }
}