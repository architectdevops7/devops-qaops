package com.example.studenttasktracker;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailingTest {

    @Test
    public void testNullPointerException() {
        String text = null;
        // Introduce a NullPointerException
        Assert.assertEquals(text.length(), 5);
    }
}
