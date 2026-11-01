/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;
import java.util.Random;
/**
 *
 * @author pokxu
 */
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random generator = new Random();

        int player1Roll1 = generator.nextInt(6) + 1;
        int player1Roll2 = generator.nextInt(6) + 1;
        int player2Roll1 = generator.nextInt(6) + 1;
        int player2Roll2 = generator.nextInt(6) + 1;

        int player1Score = player1Roll1 + player1Roll2;
        int player2Score = player2Roll1 + player2Roll2;

        System.out.println("Player 1 rolls: " + player1Roll1 + " and " + player1Roll2);
        System.out.println("Player 1 total score: " + player1Score);

        System.out.println("Player 2 rolls: " + player2Roll1 + " and " + player2Roll2);
        System.out.println("Player 2 total score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
    
}
