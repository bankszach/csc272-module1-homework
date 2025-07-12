package edu.banks.csc272;

/**
 * Student is a subclass of Person with a major.
 *
 * Concepts Covered:
 * - Inheritance with 'extends' [Lecture 2]
 * - Additional fields in subclass
 * - Calling superclass constructor with super()
 * - Overriding toString()
 */
public class Student extends Person {
    // [Lecture 2: Subclass adds field]
    private String major;

    // [Lecture 2: Constructor chaining with super()]
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    // [Lecture 2: Method overriding]
    @Override
    public String toString() {
        return "Student[" + super.toString() + ", major=" + major + "]";
    }
}
