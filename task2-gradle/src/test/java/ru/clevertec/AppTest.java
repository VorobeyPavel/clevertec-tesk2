package ru.clevertec;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testIsPositiveNumberTrue(){
        Assert.assertTrue(App.isPositiveNumber("Hello"));
    }

    @Test
    public void testIsPositiveNumberFalse(){
        Assert.assertFalse(App.isPositiveNumber(""));
    }
}
