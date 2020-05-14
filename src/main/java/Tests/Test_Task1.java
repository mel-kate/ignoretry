package main.java.Tests;

import main.java.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test_Task1 {
    Task1 task1;
    int a1 = 6;
    int b1 = 1;
    int c1 = 2;



   @Test
    public void max_int() {
       task1 = new Task1();
        int result = (task1.main(a1,b1,c1));
        int min = 1;
       assertEquals(
               result,
               min,
               "The min function result is " + result + " but got " + min
       );

    }


}
