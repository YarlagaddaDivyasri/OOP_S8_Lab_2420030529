package lab1;

import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of the sphere is: " + volume);

        scanner.close();
    }
}
