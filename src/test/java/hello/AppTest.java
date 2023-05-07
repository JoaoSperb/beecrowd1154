package hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AppTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testExecutar() {
        String input = "5\n0\n1\n2\n3\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        App app = new App();
        app.executar();

        String expectedOutput = "Fib(0) = 0\nFib(1) = 1\nFib(2) = 1\nFib(3) = 2\nFib(4) = 3\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}