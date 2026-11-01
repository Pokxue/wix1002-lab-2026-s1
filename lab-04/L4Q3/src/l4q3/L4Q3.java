/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;
import java.util.Scanner;

/**
 * @author pokxu
 */
public class L4Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, minimum = 0, maximum = 0;
        double sum = 0, sumOfSquares = 0;

        System.out.print("Enter a score [negative score to quit]: ");
        int score = sc.nextInt();
        while (score >= 0) {
            if (count == 0 || score < minimum) {
                minimum = score;
            }
            if (count == 0 || score > maximum) {
                maximum = score;
            }
            count++;
            sum += score;
            sumOfSquares += (double) score * score;

            System.out.print("Enter a score [negative score to quit]: ");
            score = sc.nextInt();
        }

        if (count == 0) {
            System.out.println("No scores entered.");
            sc.close();
            return;
        }

        System.out.println("Minimum Score: " + minimum);
        System.out.println("Maximum Score: " + maximum);
        System.out.printf("Average Score: %.2f%n", sum / count);
        
        if (count > 1) {
            double variance = (sumOfSquares - sum * sum / count) / (count - 1);
            System.out.printf("Standard Deviation: %.2f%n", Math.sqrt(variance));
        } else {
            System.out.println("Standard Deviation: needs at least two scores");
        }
        
        sc.close();
    }
}