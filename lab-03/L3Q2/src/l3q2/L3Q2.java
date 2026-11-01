/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;
import java.util.Random;
/**
 *
 * @author pokxu
 */
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random generator = new Random();
        int number = generator.nextInt(6);
        switch (number) {
            case 0 -> System.out.println(number + " is zero");
            case 1 -> System.out.println(number + " is one");
            case 2 -> System.out.println(number + " is two");
            case 3 -> System.out.println(number + " is three");
            case 4 -> System.out.println(number + " is four");
            case 5 -> System.out.println(number + " is five");
    }
}
}
