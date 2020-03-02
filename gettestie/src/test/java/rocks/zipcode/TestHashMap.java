package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;


public class TestHashMap {
    HashMap<String,Integer> hashMap;


    @Before
    public void setUp() throws Exception {
        hashMap = new HashMap<>();
        hashMap.put("One",1);
        hashMap.put("Two", 2);
        hashMap.put("Three",3);

    }

    @After
    public void tearDown() throws Exception {
    }

    //size,putAll,empty,remove,contains,replace

    @Test
    public void sizeTest(){
        hashMap.put("Four",4);
        Assert.assertEquals(4,hashMap.size());
    }

    @Test
    public void putAllTest(){
        HashMap<String,Integer> hashMap2 = new HashMap<>();
        hashMap2.put("Four",4);
        hashMap2.put("Five",5);
        hashMap2.put("Six",6);
        hashMap2.put("Seven",7);

        hashMap.putAll(hashMap2);

        Assert.assertEquals(7,hashMap.size());
    }

    @Test
    public void emptyTest(){
        hashMap.clear();
        Assert.assertTrue(hashMap.isEmpty());
    }

    @Test
    public void removeTest(){
        hashMap.remove("Three",3);
        Assert.assertEquals(2,hashMap.size());
    }

    @Test
    public void containsKeyTest(){
        hashMap.put("Four",4);
        Assert.assertTrue(hashMap.containsKey("Four"));
    }

    @Test
    public void containsValueTest(){
        hashMap.put("Four",4);
        Assert.assertTrue(hashMap.containsKey(4));
    }

    @Test
    public void replaceTest(){
        hashMap.put("Four",5);
        hashMap.replace("Four",5,4);

        Assert.assertFalse(hashMap.containsValue(5));
    }
}
