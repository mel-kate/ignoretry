package main.java.Tests;

import main.java.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test_Task1 {
    Task1 task1;
    /*int a1 = 6;
    int b1 = 1;
    int c1 = 2;*/



   @Test(dataProvider = "integers")
    public void max_int(int a1, int b1, int c1) {
       task1 = new Task1();
        int result = (task1.main(a1,b1,c1));
        int min = 6;
       assertEquals(
               result,
               min,
               "The min function result is " + result + " but got " + min
       );

    }
    @DataProvider(name = "integers")
    public Object[] getData() {
        return new Object[][] {
                {10, 6, 9},
                {12, 5, 9},
        };
    }

}
