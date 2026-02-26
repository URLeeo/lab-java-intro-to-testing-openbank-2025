package org.example;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;

    private int originalHealth;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.originalHealth = health;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getLives() { return lives; }
    public void setLives(int lives) { this.lives = lives; }

    public void decrementLive() {
        if (lives <= 0) {
            System.out.println("This character is dead");
            return;
        }

        lives = lives - 1;
        health = originalHealth;

        if (lives <= 0) {
            System.out.println("This character is dead");
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - this.strength);
        playerToAttack.checkHealth();
    }

    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }
}