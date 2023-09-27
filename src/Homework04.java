public class Homework04 {

    public static void main(String[] args) {
        // Methods
        System.out.println("Task 1: " + missingChar("kitten", 1));
        System.out.println("Task 2: " + sumDouble(1, 2));
        System.out.println("Task 3: " + intMax(1, 2, 3));
        System.out.println("Task 4: " + nearHundred(93));
        System.out.println("Task 5: " + notString("candy"));
        System.out.println("Task 6: " + isEven(4));
        printMonthName(4);
    }

    // Task 1
    public static String missingChar(String str, int n) {
        // We use substring methods to delete a character with index n
        return str.substring(0, n) + str.substring(n + 1);
    }

    // Task 2
    public static int sumDouble(int a, int b) {
        // Check if the numbers are equal and return the result depending on this
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    // Task 3
    public static int intMax(int a, int b, int c) {
        // We use the Math.max method to determine the maximum value
        return Math.max(Math.max(a, b), c);
    }

    // Task 4
    public static boolean nearHundred(int n) {
        // We use Math.abs to calculate the absolute value and check the conditions
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    // Task 5
    public static String notString(String str) {
        // We check whether the string starts with "not" and return the result depending on this
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    // Task 6
    public static boolean isEven(int num) {
        // Check if the number is even
        return num % 2 == 0;
    }

    // Task 7
    public static void printMonthName(int month) {
        // We use switch-case to output the name of the month depending on the number of the month
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
