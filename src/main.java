import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter your age: ");
        age = in.nextInt();

        if (age >= 21) {
            System.out.println("You are 21 or older, you get a wristband");
        }
    }
}
