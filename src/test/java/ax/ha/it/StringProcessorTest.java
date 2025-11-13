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

    @Test
    void shouldCompressRepeatedCharacters() {
        String result = processor.compress("aaabbc");
        assertEquals("a3b2c1", result);
    }

    @Test
    void shouldHandleSingleCharacterCompression() {
        String result = processor.compress("a");
        assertEquals("a1", result);
    }

    @Test
    void shouldCountWordsInSimpleSentence() {
        int result = processor.countWords("A cute little cat");
        assertEquals(4, result);
    }

    @Test
    void shouldHandleMultipleSpacesBetweenWords() {
        int result = processor.countWords("A   cute  little    cat");
        assertEquals(4, result);
    }

    @Test
    void shouldHandleLeadingAndTrailingSpaces() {
        int result = processor.countWords("  A cute little cat  ");
        assertEquals(4, result);
    }

    @Test
    void shouldCountSingleWord() {
        int result = processor.countWords("Hello");
        assertEquals(1, result);
    }
}
