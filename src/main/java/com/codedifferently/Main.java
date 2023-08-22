package com.codedifferently;

import java.util.Scanner;

public class Main {
    private static GradeBook gradeBook = new GradeBook(500);
    private static Scanner scanner = new Scanner(System.in);

    private static void displayMenu() {
        System.out.println("GradeBook Menu:");
        System.out.println("0. Exit");
        System.out.println("1. Add a Grade");
        System.out.println("2. Get Size");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        boolean continueRunning = true;
        while (continueRunning) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 0:
                    continueRunning = false;
                    break;
                case 1:
                    addGrade();
                    break;
                case 2:
                    size();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addGrade() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter assignment name: ");
        String assignment = scanner.nextLine();

        System.out.print("Enter score: ");
        String scoreString= scanner.nextLine();
        Double score = Double.parseDouble(scoreString);

        Grade grade = new Grade(name, assignment, score);
        gradeBook.addGrade(grade);
        System.out.println("Grade added successfully!");
    }

    private static void size() {
        Integer size = gradeBook.size();;
        System.out.println("You have " + size + " grades recorded");
    }
}
