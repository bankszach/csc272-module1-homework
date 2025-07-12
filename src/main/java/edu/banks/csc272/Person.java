package edu.banks.csc272;

/**
 * Represents a generic person with a name and year of birth.
 *
 * Concepts Covered:
 * - Encapsulation (private fields)
 * - Base class for inheritance [Lecture 2]
 * - Constructor pattern
 * - Overriding toString()
 */
public class Person {
    // [Lecture 2: Encapsulation & Inheritance]
    private String name;
    private int yearOfBirth;

    // [Lecture 2: Constructor]
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // [Lecture 2: toString() method for representation]
    public String toString() {
        return "Person[name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
    }
}
