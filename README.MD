
---

# CSC272 – Module 1 Homework

**First Name:** Zachary 
**Last Name:** Banks
**Student ID:** 900648740
**Week #:** 1
**Email:** z.banks8740@student.nu.edu

---

## Problem 1 – Simplified Microwave

### Task

Create a `Microwave` class with four “button” methods:

| Button               | Suggested method name | Action                                        |
| -------------------- | --------------------- | --------------------------------------------- |
| +30 seconds          | `increaseTime()`      | adds 30 s to current time                     |
| Switch power (1 ↔ 2) | `switchPowerLevel()`  | toggles power level 1 or 2                    |
| Start                | `start()`             | prints **“Cooking for … seconds at level …”** |
| Reset                | `reset()`             | sets time = 0 and power = 1                   |

A `main` method must show all four buttons in action.

---

### Your `Microwave.java`

```java
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

```

### Sample Run Output

```
/home/human/.jdks/ms-17.0.15/bin/java -javaagent:/app/extra/idea-IU/lib/idea_rt.jar=43295 -Dfile.encoding=UTF-8 -classpath /home/human/Documents/GitHub/csc272-module1-homework/target/classes edu.banks.csc272.Microwave
Time increased by 30 seconds. Total time: 30 seconds.
Time increased by 30 seconds. Total time: 60 seconds.
Power level switched. Current level: 2
Cooking for 60 seconds at level 2.
Microwave reset to default settings.
Cooking for 0 seconds at level 1.

Process finished with exit code 0
```

---

## Problem 2 – Person / Student / Instructor

### Task

* **Person**: name, year of birth
* **Student** (extends Person): major
* **Instructor** (extends Person): salary

Implement constructors and `toString()` in each class, plus a test program.

---

### `Person.java`

```java
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

```

### `Student.java`

```java
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

```

### `Instructor.java`

```java
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

```

### `PersonTester.java`

```java
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

```

### Sample Run Output

```
/home/human/.jdks/ms-17.0.15/bin/java -javaagent:/app/extra/idea-IU/lib/idea_rt.jar=40911 -Dfile.encoding=UTF-8 -classpath /home/human/Documents/GitHub/csc272-module1-homework/target/classes edu.banks.csc272.PersonTester
Person[name=Alice, yearOfBirth=1980]
Student[Person[name=Bob, yearOfBirth=2000], major=Computer Science]
Instructor[Person[name=Carol, yearOfBirth=1975], salary=85000.0]

Process finished with exit code 0
```

---

## Repository Link
https://github.com/bankszach/csc272-module1-homework.git

