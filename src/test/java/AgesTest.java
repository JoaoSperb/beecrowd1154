import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AgesTest {

    @Test
    public void testAges() {
        String input = "10\n20\n30\n40\n-1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Ages ages = new Ages();
        ages.main(new String[]{});
    }
}