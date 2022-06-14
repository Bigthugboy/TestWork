import DataStructure.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    public void queueCanBeCreated() {
        assertNotNull(queue);
    }

    @Test
    public void queueIsEmpty() {
        queue.isEmpty();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void queueCanAdd() {
        queue.add("funmi");
        assertEquals(1, queue.size());
    }

    @Test
    public void queueCanAddMoreNames() {
        queue.add("funmi");
        queue.add("deji");
        queue.add("tope");
        queue.add("deola");
        assertEquals(4, queue.size());
    }

    @Test
    public void peekTheLastNameOnTheQueue() {
        queue.add("funmi");
        queue.add("deji");
        queue.add("tope");
        queue.add("deola");
        assertEquals("deola", queue.peek());
    }

    @Test
    public void popTheFirstNameOnTheQueue() {
        queue.add("funmi");
        queue.add("deji");
        queue.add("tope");
        queue.add("deola");
        assertEquals("funmi", queue.pop());
        assertEquals("deji", queue.pop());
        queue.add("tosin");
        queue.add("flo flo");
        queue.add("samson");
        assertEquals(5,queue.size());

    }
}
