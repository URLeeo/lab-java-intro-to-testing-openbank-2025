package org.example;

public class Wizard extends Player {
    private String spell;
    private SpellLibrary spellLibrary;

    public Wizard(int health, int strength, int lives, String spell, SpellLibrary spellLibrary) {
        super(health, strength, lives);
        this.spell = spell;
        this.spellLibrary = spellLibrary;
    }

    public String getSpell() { return spell; }
    public void setSpell(String spell) { this.spell = spell; }

    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives(), 0);
    }

    public String castRandomSpell() {
        return "Casting " + spellLibrary.getRandomSpell();
    }
}