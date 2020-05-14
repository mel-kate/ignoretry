package main.java.Tests;

import main.java.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Task5 {
    Task5 task5;

@Test
    public void Test_reverse() {
    task5 = new Task5();
    String reversedtext = "!!!dlrow olleH";
    String checktext  = task5.reverse("Hello world!!!");
    assertTrue(
            checktext.equals(reversedtext),
            "Expected " + reversedtext + " but " + checktext + " appeared."
    );
}
}
