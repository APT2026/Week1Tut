package com.ingcollegeapt.week1tut;

import java.util.Scanner;

public class Week1Tut {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    // TODO: Add topic
                    break;
                case "2":
                    // TODO: View topics
                    break;
                case "3":
                    // TODO: Add entry to a topic
                    break;
                case "4":
                     // TODO: View entries
                    break;
                case "5":
                    //Exit
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            
            
            
           
        }
    }

    private static void showMenu() {
        System.out.println("\nLearning Logs Menu");
        System.out.println("1. Add Topic");
        System.out.println("2. View Topics");
        System.out.println("3. Add Entry");
        System.out.println("4. View Entries");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}
