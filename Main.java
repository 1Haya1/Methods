import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       // EX1
//      findSmallestNumber();
//    }
//
//    public static void findSmallestNumber() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int n1 = s.nextInt();
//
//        System.out.println("Enter second number:");
//        int n2 = s.nextInt();
//
//        System.out.println("Enter third number:");
//        int n3 = s.nextInt();
//
//        int smallest = n1;
//        if (n2 < smallest) {
//            smallest = n2;
//        }
//        if (n3 < smallest) {
//            smallest = n3;
//        }
//        System.out.println("The smallest value is " + smallest);}}


//EX2

//        checkNumber();
//    }
//
//    public static void checkNumber() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n1 = s.nextInt();
//
//        if (n1 > 0) {
//            System.out.println("The number is positive.");
//        } else if (n1 < 0) {
//            System.out.println("The number is negative.");
//        } else {
//            System.out.println("The number is zero.");
//        }
//
//    }}


   //EX3

//        Scanner s = new Scanner(System.in);
//        System.out.println("1. A password must have at least eight characters. \n" +
//                "2. A password consists of only letters and digits. \n" +
//                "3. A password must contain at least two digits\n" +
//                "Input a password (You are agreeing to the above Terms and Conditions.): ");
//        String password = s.nextLine();
//
//        if (isValidPassword(password)) {
//            System.out.println("Password is valid: " + password);
//        } else {
//            System.out.println("Invalid password.");
//        }
//    }
//
//    public static boolean isValidPassword(String password) {
//        // الشروط:
//        // 1. يجب أن تحتوي كلمة المرور على عشرة أحرف على الأقل.
//        // 2. يجب أن تتكون كلمة المرور فقط من الحروف والأرقام.
//        // 3. يجب أن تحتوي كلمة المرور على رقمين على الأقل.
//
//        // الشرط 1:
//        if (password.length() < 10) {
//            System.out.println("A password must have at least ten characters.");
//            return false;
//        }
//
//        // الشرط 2:
//        for (char c : password.toCharArray()) {
//            if (!Character.isLetterOrDigit(c)) {
//                System.out.println("A password consists of only letters and digits.");
//                return false;
//            }
//        }
//
//        // الشرط 3:
//        int digitCount = 0;
//        for (char c : password.toCharArray()) {
//            if (Character.isDigit(c)) {
//                digitCount++;
//            }
//        }
//        if (digitCount < 2) {
//            System.out.println("A password must contain at least two digits.");
//            return false;
//        }
//        return true;}}