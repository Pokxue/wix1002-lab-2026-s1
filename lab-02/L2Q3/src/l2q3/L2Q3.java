/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;
import java.util.Locale;
import java.util.Random;
/**
 *
 * @author pokxu
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Random generator = new Random();
        int first = generator.nextInt(41) + 10;
        int second = generator.nextInt(41) + 10;
        int third = generator.nextInt(41) + 10;
        int sum = first + second + third;
        double average = sum / 3.0;
        System.out.printf("Numbers: %d, %d, %d%n", first, second, third);
        System.out.println("Sum: " + sum);
        System.out.printf(Locale.US, "Average: %.2f%n", average);
    }
    
}
