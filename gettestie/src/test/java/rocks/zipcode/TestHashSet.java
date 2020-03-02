package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;


public class TestHashSet {
    HashSet<String> hashSet;


    @Before
    public void setUp() throws Exception {
        hashSet = new HashSet<>();
        hashSet.add("One");


    }

    @After
    public void tearDown() throws Exception {
    }

    //size,empty,remove,contains

    @Test
    public void sizeTest(){
        hashSet.add("Two");
        Assert.assertEquals(2,hashSet.size());
    }

    @Test
    public void emptyTest(){
        hashSet.clear();
        Assert.assertTrue(hashSet.isEmpty());
    }

    @Test
    public void removeTest(){
        hashSet.remove("One");
        Assert.assertEquals(0,hashSet.size());
    }

    @Test
    public void containsTest(){
        hashSet.add("Two");
        Assert.assertTrue(hashSet.contains("Two"));
    }
    




}
