package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    //size,add,remove,contains,reverse,getIndex,sublist

    @Test
    public void addTest(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("First Element");

        Assert.assertEquals(1,arr.size());
    }

    @Test
    public void sizeTest(){
        String[] myArr = new String[]{"First","Second","Third","Fourth"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(myArr));


        Assert.assertEquals(4,arr.size());
    }

    @Test
    public void removeTest(){
        String[] myArr = new String[]{"First","Second","Third","Fourth"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(myArr));
        arr.remove(0);


        Assert.assertEquals(3,arr.size());
    }

    @Test
    public void reverseTest() {
        String[] myArr = new String[]{"First", "Second", "Third", "Fourth"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(myArr));
        Collections.reverse(arr);


        Assert.assertEquals("Fourth", arr.get(0));
    }

    @Test
    public void subListTest(){
        String[] myArr = new String[]{"First","Second","Third","Fourth"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(myArr));
        List<String> arr2 = (arr.subList(1,3));


        Assert.assertEquals(arr.get(1),arr2.get(0));
    }




}
