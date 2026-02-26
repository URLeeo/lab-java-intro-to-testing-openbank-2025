package org.example;

import org.example.Elf;
import org.example.Warrior;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void attack_decreasesOtherPlayersHealth() {
        Warrior w = new Warrior(100, 30, 2, 10);
        Elf e = new Elf(80, 10, 2, 5);

        w.attack(e);

        assertEquals(50, e.getHealth()); // 80 - 30
    }

    @Test
    void checkHealth_whenHealthIs0OrLess_decrementsLifeAndRestoresHealth() {
        Warrior w = new Warrior(100, 60, 3, 10);
        Elf e = new Elf(50, 5, 2, 7);

        w.attack(e); // 50-60 => -10 => life goes 2->1 and health restores to 50

        assertEquals(1, e.getLives());
        assertEquals(50, e.getHealth());
    }

    @Test
    void warriorConvertToElf_copiesValues_andForceBecomesSpeed() {
        Warrior w = new Warrior(120, 20, 4, 99);
        Elf e = w.convertToElf();

        assertEquals(120, e.getHealth());
        assertEquals(20, e.getStrength());
        assertEquals(4, e.getLives());
        assertEquals(99, e.getSpeed());
    }
}