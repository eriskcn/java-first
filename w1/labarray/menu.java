package labarray;

import java.util.Scanner;

public class menu {
    public static void displayMenu() {
        System.out.println("_____________MENU_____________");
        System.out.println("1. Enter an array of 10 integers");
        System.out.println("2. Print min and max values");
        System.out.println("3. Print sum and average of all elements");
        System.out.println("4. Sum of elements that are divisible by 3");
        System.out.println("5. Count of even numbers");
        System.out.println("6. Print array");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void enterArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
        } finally {
            scanner.close();
        }
    }

    public static boolean isArrayInitialized(int[] array) {
        for (int element : array) {
            if (element == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printMinMax(int[] array) {
        if (!isArrayInitialized(array)) {
            System.out.println("Array is not fully initialized. Please enter all elements first.");
            return;
        }
        int min = array[0];
        int max = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void printSumAndAverage(int[] array) {
        if (!isArrayInitialized(array)) {
            System.out.println("Array is not fully initialized. Please enter all elements first.");
            return;
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        double average = (double) sum / array.length;
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }

    public static void printSumDivisibleBy3(int[] array) {
        if (!isArrayInitialized(array)) {
            System.out.println("Array is not fully initialized. Please enter all elements first.");
            return;
        }
        int sum = 0;
        for (int element : array) {
            if (element % 3 == 0) {
                sum += element;
            }
        }
        System.out.println("Sum of elements divisible by 3: " + sum);
    }

    public static void printCountEven(int[] array) {
        if (!isArrayInitialized(array)) {
            System.out.println("Array is not fully initialized. Please enter all elements first.");
            return;
        }
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
    }

    public static void printArray(int[] array) {
        if (!isArrayInitialized(array)) {
            System.out.println("Array is not fully initialized. Please enter all elements first.");
            return;
        }
        System.out.print("[ ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.print(" ]");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10]; // Initialize the array here
        try {
            boolean exit = false;
            while (!exit) {
                displayMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        enterArray(array);
                        break;
                    case 2:
                        printMinMax(array);
                        break;
                    case 3:
                        printSumAndAverage(array);
                        break;
                    case 4:
                        printSumDivisibleBy3(array);
                        break;
                    case 5:
                        printCountEven(array);
                        break;
                    case 6:
                        printArray(array);
                        break;
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }
}
