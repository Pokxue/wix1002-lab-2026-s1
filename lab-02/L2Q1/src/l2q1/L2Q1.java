/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author pokxu
 */
import java.util.Scanner;
import java.util.Locale;
public class L2Q1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = keyboard.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf(Locale.US, "Celsius: %.2f%n", celsius);
    }
    
}
