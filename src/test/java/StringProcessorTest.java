import com.smu.mscda.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    @Test
    public void testCapitalizeString() {
        assertEquals("Hello", Main.capitalizeString("hello"));
        assertEquals("World", Main.capitalizeString("world"));
    }

    @Test
    public void testGenerateMD5Hash() {
        String input = "Hello";
        String expectedMD5 = "8b1a9953c4611296a827abf8c47804d7";
        assertEquals(expectedMD5, Main.generateMD5(input));
    }

}
