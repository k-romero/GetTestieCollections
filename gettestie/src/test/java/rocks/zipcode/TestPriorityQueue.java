package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    PriorityQueue<String> myQueue;

    @Before
    public void setUp() throws Exception{
        myQueue = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            String temp = "Element " + i;
            myQueue.add(temp);
        }
    }

    @Test
    public void peekTest(){
        Assert.assertEquals("Element 0",myQueue.peek());
        Assert.assertEquals(5,myQueue.size());
    }

    @Test
    public void pollTest(){
        Assert.assertEquals("Element 0",myQueue.poll());
        Assert.assertEquals(4,myQueue.size());
    }

    @Test
    public void offerTest(){
        myQueue.offer("Element -1");
        Assert.assertEquals("Element -1",myQueue.peek());
        Assert.assertEquals(6,myQueue.size());
    }

    @Test
    public void removeTest(){
        Assert.assertTrue(myQueue.remove("Element 4"));
        Assert.assertTrue(myQueue.size() == 4);
    }

    @Test
    public void containsTest(){
        Assert.assertTrue(myQueue.remove("Element 4"));
        Assert.assertFalse(myQueue.contains("Element 4"));
    }
}
