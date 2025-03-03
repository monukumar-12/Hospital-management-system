package HPS;

import java.util.LinkedList;
import java.util.Scanner;

public class HospitalWaitingList {
    public static void main(String[] args) {
        LinkedList<String> waitingList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nHospital Waiting List Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient (Seen by Doctor)");
            System.out.println("3. Check if Patient is in Waiting List");
            System.out.println("4. Display All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name to add: ");
                    String name = scanner.nextLine();
                    waitingList.addLast(name);
                    System.out.println(name + " added to the waiting list.");
                    break;
                case 2:
                    if (!waitingList.isEmpty()) {
                        String removedPatient = waitingList.removeFirst();
                        System.out.println(removedPatient + " has been seen by the doctor and removed from the list.");
                    } else {
                        System.out.println("No patients in the waiting list.");
                    }
                    break;
                case 3:
                    System.out.print("Enter patient name to check: ");
                    String searchName = scanner.nextLine();
                    if (waitingList.contains(searchName)) {
                        System.out.println(searchName + " is in the waiting list.");
                    } else {
                        System.out.println(searchName + " is NOT in the waiting list.");
                    }
                    break;
                case 4:
                    if (!waitingList.isEmpty()) {
                        System.out.println("Patients in waiting list: " + waitingList);
                    } else {
                        System.out.println("Waiting list is empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close(); // Properly close the scanner here
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
