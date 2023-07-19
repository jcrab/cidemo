package edu.una.ghactiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    public void sayHello() {
    	Hello h = new Hello();
        assertEquals("hi there", h.sayHello(), "bad output");
    }

}
