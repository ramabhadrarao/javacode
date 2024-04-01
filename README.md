# History of Java

Java, a high-level programming language, has a rich history dating back to the mid-1990s. Here's a chronological overview:

## 1. Origins (1991-1995)

- **1991**: James Gosling, Mike Sheridan, and Patrick Naughton begin the Green Project at Sun Microsystems.
- **1995**: The team releases Java 1.0, introducing applets for web browsers and "Write Once, Run Anywhere" (WORA) capability.

## 2. Java's Rise (1996-2000)

- **1996**: Sun Microsystems releases Java 1.0.2 with support for JDK (Java Development Kit) 1.0.
- **1997**: Java gains popularity due to its platform independence and security features.
- **1998**: Sun releases Java 1.2, codenamed "Playground," introducing the Swing API and the Collections Framework.
- **1999**: Java 1.3, codenamed "Kestrel," brings performance enhancements and support for the HotSpot JVM.

## 3. Evolution and Expansion (2001-2010)

- **2000**: Sun releases Java 1.4, codenamed "Merlin," with improvements like assert, regular expressions, and NIO.
- **2004**: Java 5 (J2SE 5.0), codenamed "Tiger," introduces generics, metadata annotations, and the enhanced for loop.
- **2006**: Java 6 (Java SE 6), codenamed "Mustang," features improvements in performance, stability, and compatibility.
- **2009**: Oracle Corporation acquires Sun Microsystems, becoming the new steward of the Java platform.

## 4. Modern Java (2011-Present)

- **2011**: Java 7 is released, introducing the try-with-resources statement, the diamond operator, and invokedynamic.
- **2014**: Java 8, codenamed "Spider," brings significant changes with lambda expressions, the Stream API, and the java.time package.
- **2017**: Java 9 introduces modularity with the Java Platform Module System (JPMS) and the jshell tool for interactive Java programming.
- **2018**: Java 10 features local variable type inference (var) and improvements in the Garbage Collector.
- **2019**: Java 11, a long-term support (LTS) release, provides performance enhancements and new APIs.
- **2021**: Java 17, another LTS release, offers enhanced security, performance improvements, and new language features.

## 5. Future of Java

Java continues to evolve with updates, community contributions, and emerging trends in software development. With the introduction of Project Loom, Project Panama, and other initiatives, the Java ecosystem remains vibrant and relevant in modern computing.
# Java Command-line Arguments

When running a Java application from the command line, you can provide arguments to customize its behavior. These arguments are passed to the `main` method of the Java program as an array of strings. Here's how it works:

## Basic Syntax

The basic syntax for running a Java application with command-line arguments is:


Where:
- `java` is the command to run Java programs.
- `YourClassName` is the name of the class containing the `main` method.
- `arg1`, `arg2`, etc., are the command-line arguments passed to the program.

## Accessing Command-line Arguments

Within your Java program, you can access these command-line arguments via the `args` parameter of the `main` method:

```java
public class YourClassName {
    public static void main(String[] args) {
        // args is an array containing command-line arguments
        for (String arg : args) {
            System.out.println("Argument: " + arg);
        }
    }
}
Example Usage : java MyProgram arg1 arg2 arg3
public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
Number of arguments: 3
Argument 0: arg1
Argument 1: arg2
Argument 2: arg3

