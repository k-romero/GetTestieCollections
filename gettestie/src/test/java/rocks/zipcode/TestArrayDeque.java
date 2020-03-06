package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Vector;

public class TestArrayDeque {
    ArrayDeque<String> myDeque;

    @Before
    public void setUp() throws Exception{
       myDeque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            String temp = "Element " + i;
            myDeque.add(temp);
        }

    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void sizeTest(){
        Assert.assertTrue(myDeque.size() == 5);
    }

    @Test
    public void peekTest(){
        Assert.assertTrue(myDeque.peek().equals("Element 0"));
    }

    @Test
    public void peekLastTest(){
        Assert.assertTrue(myDeque.peekLast().equals("Element 4"));
    }

    @Test
    public void pollLastTest(){
        myDeque.pollLast();
        Assert.assertTrue(myDeque.peekLast().equals("Element 3"));
    }

    @Test
    public void popTest(){
        Assert.assertTrue(myDeque.pop().equals("Element 0"));
    }

    @Test
    public void pushTest(){
        myDeque.push("Element -1");
        Assert.assertTrue(myDeque.pop().equals("Element -1"));
    }


}
