package edu.una.ghactiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GoodbyeTest {
    @Test
    public void sayBye() {
    	Goodbye g = new Goodbye();
        assertEquals("see ya", g.sayBye(), "bad bye output");
    }
}
