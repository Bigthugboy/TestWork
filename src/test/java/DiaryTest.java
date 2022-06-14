import Diary.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    private Diary myDiary;
    @BeforeEach
    void setUp() {
        myDiary = new Diary("1234");
    }

    @Test
    public void diary(){
        assertNotNull(myDiary);
    }


    @Test
    void diaryCanHaveMoreThanOneEntries(){
        myDiary.createEntry("my lovely diary","i love the world ");
        myDiary.createEntry("my lovely ","i love the world ");
        myDiary.createEntry(" lovely diary","i love the world ");
        myDiary.createEntry("my  diary","i love the world ");

        assertEquals(4, myDiary.getNumberOfEntries());
    }
    @Test
    void canFindTitleInDiary(){
        myDiary.createEntry("my lovely diary","i love the world ");
        myDiary.createEntry("my lovely ","i love the world ");
        myDiary.createEntry(" lovely diary","i love the world ");
        myDiary.createEntry("my","i love the world ");
        int num = myDiary.findEntry("my");
        assertEquals(4,num);

    }
    @Test
    void canDeleteTitleInDiary(){
        myDiary.createEntry("my lovely diary","i love the world ");
        myDiary.createEntry("my lovely ","i love the world ");
        myDiary.createEntry(" lovely diary","i love the world ");
        myDiary.createEntry("my","i love the world ");
         myDiary.deleteEntry("my lovely diary");
        assertEquals(3,myDiary.getNumberOfEntries());

    }
    @Test
    void diaryCanLock(){
        myDiary.lock();
        assertTrue(myDiary.lock());

    }
    @Test
    void diaryCanBeUnlockWithPassword(){
        myDiary.lock();
        assertTrue(myDiary.unLock("1234"));
    }

}