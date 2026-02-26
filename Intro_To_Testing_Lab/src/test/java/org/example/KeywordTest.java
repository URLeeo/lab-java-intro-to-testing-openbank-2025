package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeywordTest {

    @Test
    void returnsTrueIfTextContainsAJavaKeywordWord() {
        assertTrue(Keywords.containsJavaKeyword("It may break your bone"));
        assertTrue(Keywords.containsJavaKeyword("I will return back from vacation next month."));
        assertTrue(Keywords.containsJavaKeyword("null is an empty thing"));
    }

    @Test
    void returnsFalseIfKeywordIsInsideAnotherWord() {
        assertFalse(Keywords.containsJavaKeyword("Breakfast is really important."));
        assertFalse(Keywords.containsJavaKeyword("classification is cool"));
    }

    @Test
    void handlesEmptyOrNull() {
        assertFalse(Keywords.containsJavaKeyword(""));
        assertFalse(Keywords.containsJavaKeyword("   "));
        assertFalse(Keywords.containsJavaKeyword(null));
    }
}