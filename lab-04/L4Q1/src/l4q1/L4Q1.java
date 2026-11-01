/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;
import java.util.Scanner;
/**
 *
 * @author pokxu
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("The factors are:");
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}