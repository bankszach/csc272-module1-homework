package edu.banks.csc272;

/**
 * Microwave class: Simulates a microwave control panel.
 *
 * Concepts Covered:
 * - Encapsulation (private fields)
 * - Methods as Behaviors (each button is a method)
 * - Constructor usage
 * - Mutator and Accessor Patterns
 * - Test code in main method
 * (Lecture 1, CSC272)
 */
public class Microwave {
    // [Lecture 1: Encapsulation]
    private int time;         // in seconds
    private int powerLevel;   // 1 or 2

    /**
     * [Lecture 1: Constructor]
     * Default constructor: sets time to 0, power level to 1.
     */
    public Microwave() {
        time = 0;
        powerLevel = 1;
    }

    /**
     * [Lecture 1: Mutator]
     * Increases time by 30 seconds.
     */
    public void increaseTime() {
        time += 30;
        System.out.println("Time increased by 30 seconds. Total time: " + time + " seconds.");
    }

    /**
     * [Lecture 1: Mutator & State Toggle]
     * Switches between power level 1 and 2.
     */
    public void switchPowerLevel() {
        powerLevel = (powerLevel == 1) ? 2 : 1;
        System.out.println("Power level switched. Current level: " + powerLevel);
    }

    /**
     * [Lecture 1: Behavior/Action]
     * Starts the microwave, outputs settings.
     */
    public void start() {
        System.out.println("Cooking for " + time + " seconds at level " + powerLevel + ".");
    }

    /**
     * [Lecture 1: Mutator & Reset Pattern]
     * Resets the microwave to default settings.
     */
    public void reset() {
        time = 0;
        powerLevel = 1;
        System.out.println("Microwave reset to default settings.");
    }

    /**
     * [Lecture 1: Testing & Demonstration]
     * Main method tests all behaviors.
     */
    public static void main(String[] args) {
        Microwave mw = new Microwave();
        mw.increaseTime();
        mw.increaseTime();
        mw.switchPowerLevel();
        mw.start();
        mw.reset();
        mw.start();
    }
}
