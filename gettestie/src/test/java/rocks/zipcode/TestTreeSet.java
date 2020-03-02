package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;
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
}
