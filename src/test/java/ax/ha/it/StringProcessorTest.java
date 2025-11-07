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

    @Test
    void shouldHandleSingleCharacter() {
        String result = processor.reverse("a");
        assertEquals("a", result);
    }

    @Test
    void shouldHandleNullAndEmptyString() {
        String result = processor.reverse("");
        assertEquals("", result);
    }

    @Test
    void shouldPreserveSpacesInReversal() {
        String result = processor.reverse("hello world");
        assertEquals("dlrow olleh", result);
    }
}
