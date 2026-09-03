// Eitan pd. 4
// This program will calculate the date easter falls on given a year after 1583.
import java.util.*;

public class Easter{
    public static void main(String[] args) {
        //code goes here
        Scanner scanner = new Scanner(System.in); //this allows you to read input from the user.
        int y = scanner.nextInt(); // reads the next number the user types. 
        int a = y % 19;
        System.out.println("a = "+a);
        int b = y % 100;
        System.out.println("b = "+b);
        int c = b % 4;
        System.out.println("c = "+c);
        int d =(b+8)/25;
        System.out.println("d = "+d);

    }
}

