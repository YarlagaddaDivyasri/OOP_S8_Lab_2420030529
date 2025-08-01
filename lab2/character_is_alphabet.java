package lab2;

import java.util.Scanner;

public class character_is_alphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else {
            System.out.println(ch + " is NOT an Alphabet.");
        }
    }
}
