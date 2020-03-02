package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;


public class TestLinkedList {
    LinkedList<String> linkedList;


    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList<>();
        linkedList.add("One");


    }

    @After
    public void tearDown() throws Exception {
    }

    //size,empty,remove,contains,addLast,poll,set

    @Test
    public void sizeTest(){
        Assert.assertEquals(1,linkedList.size());
    }

    @Test
    public void emptyTest(){
        linkedList.clear();
        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void removeTest(){
        String expected = "One";
        String actual = linkedList.remove();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeIndexTest(){
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.remove(1);

        Assert.assertEquals(2,linkedList.size());
    }

    @Test
    public void containsTest(){
        Assert.assertFalse(linkedList.contains("Five"));
    }

    @Test
    public void addLastTest(){
        linkedList.add("Three");
        linkedList.addLast("Two");
        Assert.assertEquals("Two",linkedList.removeLast());
    }

    @Test
    public void pollTest(){
        Assert.assertEquals("One",linkedList.poll());
        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void setTest(){
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.set(1,"Four");

        Assert.assertEquals("Four",linkedList.get(1));
    }




}
