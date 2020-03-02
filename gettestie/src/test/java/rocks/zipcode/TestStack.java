package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<String> stack;


    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>();
        stack.push("First In");
        stack.push("Second In");
        stack.push("Third In");
        stack.push("Fourth In");

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    //push,pop,peek,search,empty

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }



    @Test
    public void popTest(){
        Assert.assertEquals("Fourth In",stack.pop());
    }

    @Test
    public void peekTest(){
        Assert.assertEquals("Fourth In",stack.peek());
    }

    @Test
    public void searchTest(){
        Assert.assertEquals(4,stack.search("First In"));
    }

    @Test
    public void emptyTest(){
        stack.clear();
        Assert.assertTrue(stack.isEmpty());
    }







}
