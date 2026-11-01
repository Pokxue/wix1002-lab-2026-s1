/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;
import java.util.Random;
/**
 *
 * @author pokxu
 */
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random random = new Random();
        int n = random.nextInt(101); 
        System.out.println("Generated n = " + n);
        
        System.out.println("The first " + n + " prime numbers are:");
        
        int count = 0;
        int num = 2;
        
        while (count < n) {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}
