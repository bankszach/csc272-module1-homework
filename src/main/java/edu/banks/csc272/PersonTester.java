package edu.banks.csc272;

/**
 * Tests the Person, Student, and Instructor classes.
 *
 * Concepts Covered:
 * - Polymorphism (all can be treated as Person)
 * - Object instantiation
 * - Demonstrating method overriding
 */
public class PersonTester {
    public static void main(String[] args) {
        Person p = new Person("Alice", 1980);
        Student s = new Student("Bob", 2000, "Computer Science");
        Instructor i = new Instructor("Carol", 1975, 85000);

        // [Lecture 2: Polymorphic toString() behavior]
        System.out.println(p);
        System.out.println(s);
        System.out.println(i);
    }
}
