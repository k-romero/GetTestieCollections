package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    TreeSet<String> treeSet;

    @Before
    public void setUp() throws Exception{
        treeSet = new TreeSet<>();
        treeSet.add("One");

    }

    @After
    public void tearDown() throws Exception{

    }

    //size,last,poll

    @Test
    public void sizeTest(){
        Assert.assertEquals(1, treeSet.size());
    }

    @Test
    public void lastTest(){
        for (int i = 0; i < 5; i++) {
            treeSet.add("another entry " + i);
        }
        Assert.assertEquals("another entry 4", treeSet.last());
    }

    @Test
    public void pollTest(){
        treeSet.clear();
        Assert.assertEquals(null, treeSet.pollFirst());
    }

    @Test
    public void lastHighestElmTest(){
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        treeSet.add("Six");
        String lastElm = treeSet.last();
        String expected = "Two";
        Assert.assertEquals(expected,lastElm);
    }

    @Test
    public void iteratorTest(){
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        treeSet.add("Six");
        Iterator iterator = treeSet.iterator();
        int expected = 6;
        int actual = 0;
        for (Iterator it = iterator; it.hasNext(); ) {
            it.next();
            actual = actual + 1;
        }
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void higherTest(){
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        treeSet.add("Six");

        Assert.assertEquals(null,treeSet.higher("Two"));
    }

    @Test
    public void lowerTest(){
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        treeSet.add("Six");
        Assert.assertEquals("Three",treeSet.lower("Two"));
    }
}
