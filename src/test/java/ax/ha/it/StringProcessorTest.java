package ax.ha.it;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void shouldDetectSimplePalindrome() {
        assertTrue(processor.isPalindrome("racecar"));
    }

    @Test
    void shouldDetectNonPalindrome() {
        assertFalse(processor.isPalindrome("hello"));
    }

    @Test
    void shouldHandleCaseInsensitivePalindromes() {
        assertTrue(processor.isPalindrome("RaceCar"));
        assertFalse(processor.isPalindrome("Hello"));
    }

    @Test
    void shouldHandlePalindromesWithSpaces() {
        assertTrue(processor.isPalindrome("race car"));
        assertFalse(processor.isPalindrome("hello world"));
    }

    @Test
    void shouldHandleSingleCharacterAsPalindrome() {
        assertTrue(processor.isPalindrome("a"));
        assertTrue(processor.isPalindrome("A"));
    }

    @Test
    void shouldHandleNullAndEmptyAsPalindromes() {
        assertTrue(processor.isPalindrome(null));
        assertTrue(processor.isPalindrome(""));
    }
}
