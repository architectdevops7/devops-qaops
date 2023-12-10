package com.example.studenttasktracker;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailingTest {

    @Test
    public void testNullPointerException() {
    String text = null;
    // Check for null before calling length()
    if (text != null) {
        Assert.assertEquals(text.length(), 5);
    } else {
        // Handle the case where text is null
        // For example, log a message or fail the test with an appropriate message
        Assert.fail("Text is null");
    }
    }
}
