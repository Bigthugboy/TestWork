import DataStructure.Hashmap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class hashMapTest {
    private Hashmap haspmap;
    @BeforeEach
    void setUp(){haspmap = new Hashmap();}

    @Test
    public void haspMapCanBeCreated(){
        assertNotNull(haspmap);
    }

@Test
public void hashMapIsEmpty(){
    haspmap.isEmpty();
    assertEquals(true,haspmap.isEmpty());

}
@Test
    public void hashMapCanAddWithKeyAndValue(){
    haspmap.put(0,"deji");
    assertEquals(1,haspmap.size());
}
@Test
    public void hashMapCanAddMoreValueWithKey(){
        haspmap.put(0,"england");
        haspmap.put(1,"italy");
        haspmap.put(2,"spain");
        haspmap.put(3,"france");
        assertEquals(4,haspmap.size());
}
@Test
    public void hashMapCantTakeDuplicateKey(){
    haspmap.put(0,"england");
    haspmap.put(1,"italy");
    haspmap.put(2,"spain");
    haspmap.put(1,"italy");
    assertEquals(4,haspmap.size());
}
@Test
    public void hashMapCanGetWithIndex(){
    haspmap.put(0,"england");
    haspmap.put(1,"italy");
    haspmap.put(2,"spain");
    assertEquals("italy",haspmap.get(1));

}
}

