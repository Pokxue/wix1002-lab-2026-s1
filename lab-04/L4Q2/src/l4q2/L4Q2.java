/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;
import java.util.Scanner;
/**
 *
 * @author pokxu
 */
public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();   
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            int termSum = 0; 
            for (int j = 1; j <= i; j++) {
                termSum += j; 
            }
            totalSum += termSum;
        }
        System.out.println("The sum of the series is: " + totalSum);
        sc.close();
    }
}
