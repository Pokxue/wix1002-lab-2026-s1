/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2q1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author pokxu
 */
public class L2Q2 {
  public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Car price: ");
        double price = keyboard.nextDouble();
        System.out.print("Down payment: ");
        double downPayment = keyboard.nextDouble();
        System.out.print("Annual interest rate (%): ");
        double rate = keyboard.nextDouble();
        System.out.print("Duration (years): ");
        double years = keyboard.nextDouble();
        double monthly = (price - downPayment) * (1 + rate * years / 100)
                / (years * 12);
        System.out.printf(Locale.US, "Monthly payment: RM %.2f%n", monthly);  
 }
}
