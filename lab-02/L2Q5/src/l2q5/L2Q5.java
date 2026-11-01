/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;
import java.util.Random;

/**
 *
 * @author pokxu
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random generator = new Random();
        int number = generator.nextInt(10001);
        int num = number;
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }
    
}
