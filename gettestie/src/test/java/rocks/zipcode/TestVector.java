package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    Vector<String> myVector;

    @Before
    public void setUp() throws Exception{
        myVector = new Vector<>(45);
        myVector.add("One");
        myVector.add("Two");
        myVector.add("Three");

    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void vectorCapacityTest(){
        Assert.assertTrue(myVector.capacity() == 45);
    }

    @Test
    public void vectorEnsureCapacityTest(){
        myVector.ensureCapacity(100);
        Assert.assertTrue(myVector.capacity() == 100);
    }

    @Test
    public void insertElmAtLocTest(){
        String elm2 = "This is index 2";
        myVector.insertElementAt(elm2,3);
        Assert.assertTrue(myVector.get(3).equals("This is index 2"));
    }

    @Test
    public void lastIndexOfTest(){
        Assert.assertEquals(-1,myVector.lastIndexOf("Three",1));
    }
}
