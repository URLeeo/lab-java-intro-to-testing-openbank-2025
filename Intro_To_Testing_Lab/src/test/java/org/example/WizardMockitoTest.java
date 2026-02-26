package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WizardMockitoTest {

    @Test
    void castRandomSpell_usesMockedLibrary() {
        SpellLibrary lib = mock(SpellLibrary.class);

        when(lib.getRandomSpell()).thenReturn("Fireball");

        Wizard w = new Wizard(100, 10, 2, "Any", lib);

        String result = w.castRandomSpell();

        verify(lib, times(1)).getRandomSpell();
        assertEquals("Casting Fireball", result);
    }
}
