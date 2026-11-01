/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;
import java.util.Scanner;
/**
 *
 * @author pokxu
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        long totalSeconds = keyboard.nextLong();
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n",
                totalSeconds, hours, minutes, seconds);

        keyboard.close();
    }
    
}
