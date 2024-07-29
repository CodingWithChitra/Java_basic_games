
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        boolean isCorrect = false; // guessing
        int attempt = 0;
        System.out.println(" Welcome to guessing number.");
        System.out.println("=================================");
        int sysnum = rn.nextInt(3) + 1;
        while(! isCorrect){ //while loop
            System.out.print("Please Enter the number from 0 to 100= ");
            
            int guessNutmber = sc.nextInt();

            if(guessNutmber < sysnum){
                System.out.println("Your guess is too small!");
            }else if(guessNutmber > sysnum){
                System.out.println(" Your guess is to bigger!");
            }else{
                System.out.println("Congratulation you did correct!");
                isCorrect = true;
            }

            if(attempt == 5){
                System.out.println("Your guess is reaching limitted!");
                break;
            }
            attempt ++;
        }
        sc.close();
    }
}