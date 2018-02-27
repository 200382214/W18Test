/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classlab;

import java.util.Scanner;

/**
 *
 * @author Dhvanit
 */
public class CircleTest {
    public static void main(String[] args){
        int value;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your favourite radius: ");
        value=s.nextInt();
        Circle circle1= new Circle(value,"dhvanit");
        System.out.printf("Name : %s The area of cirlce with radius %.2f is %.2f",circle1,circle1.getRadius(),circle1.GetArea());
        System.out.printf("\nThe perimiter of cirlce with radius %.2f is %.2f",circle1.getRadius(),circle1.GetPerimiter());
    }
}
