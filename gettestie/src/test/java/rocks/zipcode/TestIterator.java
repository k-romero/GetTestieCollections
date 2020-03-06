package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {

    List<String> myArrayList;
    Iterator<String> iterator;


    @Before
    public void setUp() throws Exception{
        myArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String temp = "Element " + i;
            myArrayList.add(temp);
        }
        iterator = myArrayList.iterator();
    }

    @Test
    public void nextTest(){
        Assert.assertEquals("Element 0",iterator.next());
    }

    @Test
    public void nextLastTest(){
        for (int i = 0; i < 4; i++) {
            iterator.next();
        }
        Assert.assertEquals("Element 4",iterator.next());
    }

    @Test
    public void removeTest(){
        for (int i = 0; i < 4; i++) {
            iterator.next();
            iterator.remove();
        }
        Assert.assertEquals("Element 4",iterator.next());
    }

    @Test
    public void hasNextTest(){
        for (int i = 0; i < 4; i++) {
            iterator.next();
            iterator.remove();
        }
        iterator.next();
        Assert.assertFalse(iterator.hasNext());
    }


}
