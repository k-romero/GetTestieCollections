package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TestComparable {

    Person person1 = new Person("Kevin",1988);
    Person person2 = new Person("Mike",1987);
    Person person3 = new Person("Jim",1989);
    Person person4 = new Person("Jim",1942);

    List<Person> myList;

    @Before
    public void setUp() throws Exception{
        myList = new ArrayList<>();
        myList.add(person1);
        myList.add(person2);
        myList.add(person3);
        myList.add(person4);

    }

    @Test
    public void comparableTest(){
        Collections.sort(myList);
        Assert.assertEquals( 1942,myList.get(0).getYearOfBirth());
        Assert.assertEquals( 1987,myList.get(1).getYearOfBirth());
        Assert.assertEquals( 1988,myList.get(2).getYearOfBirth());
        Assert.assertEquals( 1989,myList.get(3).getYearOfBirth());
    }

}
