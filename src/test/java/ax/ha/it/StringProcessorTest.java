package ax.ha.it;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTest {

    private StringProcessor processor;

    @BeforeEach
    public void setUp() {
        processor = new StringProcessor();
    }

    @Test
    void shouldReverseSimpleString() {
        String result = processor.reverse("hello");
        assertEquals("olleh", result);
    }
}
