package zdie;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //system.out.println("Hello From ").projectName;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello From: ");
        String projectName = input.nextLine();

        System.out.println("Hello, my name is: " + projectName);

    }
}
