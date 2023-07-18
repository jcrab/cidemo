package edu.una.hello;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import edu.una.hello.Hello;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author jcrab
 */
public class HelloTest {

    public HelloTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(null);
    }
    
    private final ByteArrayOutputStream outStream =
      new ByteArrayOutputStream();

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void mytestmethod() {
        //assertTrue(2 == 3);

        Hello h = new Hello();
        h.sayHello();
        assertEquals("Hello World!", outStream.toString());
    }
}
