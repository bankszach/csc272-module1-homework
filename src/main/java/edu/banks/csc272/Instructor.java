package edu.banks.csc272;

/**
 * Instructor is a subclass of Person with a salary.
 *
 * Concepts Covered:
 * - Inheritance with 'extends' [Lecture 2]
 * - Additional field in subclass
 * - Calling superclass constructor with super()
 * - Overriding toString()
 */
public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor[" + super.toString() + ", salary=" + salary + "]";
    }
}
