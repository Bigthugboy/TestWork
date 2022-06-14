import DataStructure.mySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private mySet set;

    @BeforeEach
    void setUp(){
        set = new mySet();
    }
    @Test
        public void setCreation(){
        assertNotNull(set);

    }
    @Test
    public void setIsEmptyByDefault(){
        set.isEmpty();
        assertTrue(set.isEmpty());

    }
    @Test
    public void setCanAdd(){
        set.add("deji");
        assertEquals(1,set.size());
    }
    @Test
    public void setCanAddMoreName(){
        set.add("deji");
        set.add("titi");
        set.add("shayo");
        set.add("flo flo");
        assertEquals(4,set.size());
    }
    @Test
    public void setCanGetNameWithString(){
        set.add("deji");
        set.add("titi");
        set.add("shayo");
        set.add("flo flo");

        assertEquals("deji",set.get("deji",0));


    }
    @Test
    public void setCanGetWithIndex(){
        set.add("deji");
        set.add("titi");
        set.add("shayo");
        set.get(2);
        assertEquals("titi",set.get(1));
    }
    @Test
    public void setCanRemoveNameWithIndex(){
        set.add("deji");
        set.add("titi");
        set.add("shayo");
        set.remove(1);
        assertEquals(2,set.size());

    }
    @Test
    public void setCanRemoveWithString(){
        set.add("deji");
        set.add("titi");
        set.add("shayo");
        set.remove("deji");
        assertEquals(2,set.size());

    }
    @Test
    public void setCantTakeDuplicate(){
        set.add("deji");
        set.add("titi");
        set.add("shayo");
        set.add("deji");
      //  set.duplicate("deji");
        //assertTrue(set.contains("deji"));
        assertEquals(3,set.size());

    }


}
