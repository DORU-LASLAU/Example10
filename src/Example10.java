import java.util.Scanner;
class Example10 {
    public static void main(String[] argv) {
        float x;
        System.out.println("Enter a number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();
        if (x >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}
