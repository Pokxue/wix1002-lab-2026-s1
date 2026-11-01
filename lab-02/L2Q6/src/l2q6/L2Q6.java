/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author pokxu
 */
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Water mass in grams: ");
        double massGrams = keyboard.nextDouble();
        System.out.print("Initial temperature in Fahrenheit: ");
        double initialF = keyboard.nextDouble();
        System.out.print("Final temperature in Fahrenheit: ");
        double finalF = keyboard.nextDouble();
        double massKg = massGrams / 1000.0;
        double initialC = (initialF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;
        double energy = massKg * (finalC - initialC) * 4184;
        System.out.printf(Locale.US, "Energy: %.2f J%n", energy);
        System.out.printf(Locale.US, "Scientific: %.6e J%n", energy);
        keyboard.close();
    }
    
}
