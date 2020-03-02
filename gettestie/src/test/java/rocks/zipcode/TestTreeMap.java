package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {
    TreeMap<String, Integer> treeMap;

    @Before
    public void setUp() throws Exception{
        treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
    }

    @After
    public void tearDown() throws Exception{

    }

    //size,empty,remove,contains

    @Test
    public void sizeTest(){
        Assert.assertEquals(3, treeMap.size());
    }


    @Test
    public void containsKeyTest() {
        String expected = "Two";
        Assert.assertTrue(treeMap.containsKey(expected));
    }


    @Test
    public void containsValueTest(){
        Integer expected = 3;
        Assert.assertTrue(treeMap.containsValue(expected));
    }


    @Test
    public void emptyTest(){
        treeMap.clear();
        Assert.assertFalse(treeMap.containsKey("Three"));
    }

    @Test
    public void removeTest(){
        treeMap.remove("Two",2);
        Assert.assertEquals(2,treeMap.size());
    }

}
