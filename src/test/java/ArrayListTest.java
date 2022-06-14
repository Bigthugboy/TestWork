import DataStructure.myArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListTest {
    private myArrayList array;

    @BeforeEach
    void setUp() {
        array = new myArrayList();
    }

    @Test
    public void ArrayListTest() {
        ArrayListTest array = new ArrayListTest();
        assertNotNull(array);
    }

    @Test
    public void arrayCanAdd() {
        array.add("folarin");
        array.add("deji");
        assertEquals(2, array.getSize());

    }

    @Test
    public void arrayCanAddUpToTenNames() {
        array.add("flo flo");
        array.add("akin");
        array.add("derek");
        array.add("deji");
        array.add("flolarin");
        array.add("tosin");
        array.add("annh");
        array.add("chief");
        array.add("chibuzor");
        array.add("ogechuku");
        array.add("ogechuku");
        array.add("ogechuku");
        assertEquals(12, array.getSize());
    }

    @Test
    public void arrayCanRemoveNames() {
        array.add("akin");
        array.add("derek");
        array.add("deji");
        array.add("folarin");
        array.add("tosin");
        array.add("annh");
        array.add("chief");
        array.add("chibuzor");
        array.add("ogechuku");
        array.remove(3);
        assertEquals(8, array.getSize());




    }

    @Test
    public void arrayCanIncreaseInSize() {
        array.add("akin");
        array.add("derek");
        array.add("deji");
        array.add("flolarin");
        array.add("tosin");
        array.add("annh");
        array.add("chief");
        array.add("chibuzor");
        array.add("ogechuku");
        array.add("akin");
        array.add("derek");
        array.add("deji");
        array.add("flolarin");
        array.add("tosin");
        array.add("annh");
        array.add("chief");
        array.add("chibuzor");
        array.add("ogechuku");

        assertEquals(18, array.getSize());
    }

    @Test
    public void arryCanGetWithIndex() {
        array.add("deji");
        array.add("folarin");
        array.add("tosin");
        array.add("annh");
        array.get(1);
        assertEquals("folarin", array.get(1));

    }

    @Test
    public void arrayCanGetWithString() {
        array.add("deji");
        array.add("folarin");
        array.add("tosin");
        array.add("annh");
        array.get(1);
        assertEquals("folarin", array.get("folarin",1));
    }
    @Test
    public void arrayCanAddWithStringAndIndex(){
        array.add("deji",0);
        array.add("thug",1);
        array.add("big",2);
        array.add("boy",3);
        array.add("boy",4);
        array.add("thug",5);
        array.add("big",6);
        array.add("boy",7);
        assertEquals(8,array.getSize());
    }
    @Test
    public void arrayGetWithIndex(){
        array.add("big",2);
        array.add("boy",3);
        array.add("boy",4);
        array.add("thug",5);
        array.remove("boy");
        assertEquals("boy",array.get(3));

    }
}
