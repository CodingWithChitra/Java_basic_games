import java.util.Random;
import java.util.Scanner;

public class RockPaperScisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String rps[] = {"Rokc","Paper","Scisor"};
        boolean playAgain = true;
        System.out.println("===========================================");
        System.out.println("=======Welcome to Rock Paper & Scisor Games");
        System.out.println("===========================================");

        while (playAgain) {
            System.out.print("Enter your Choice[Paper,Rock or Scisor]: ");
            String userMove = sc.nextLine();
            if("Exit".equalsIgnoreCase(userMove)){
                playAgain = false;
            }else if(isValidMove(userMove)){
                int computerIdex = rd.nextInt(rps.length); //[0,1,2]
                String computerMove = rps[computerIdex];
                System.out.println(" Computer Move Is: "+ computerMove);
                if(userMove.equalsIgnoreCase(computerMove)){
                    System.out.println("It's a tie. Let's try again!");
            }else if(("Rock".equalsIgnoreCase(userMove) && "Scisor".equalsIgnoreCase(computerMove))
                   ||("Paper".equalsIgnoreCase(userMove) && "Rock".equalsIgnoreCase(computerMove))
                   ||("Scisor".equalsIgnoreCase(userMove) && "Paper".equalsIgnoreCase(computerMove))

                ){
                    System.out.println("Congratulation you won the games!");
                }else{
                    System.out.println("Opps You lose the games!");
                }

            }else{
                System.out.println("Invalid input please try again!");
            }
        }
        System.out.println("Thanks for playing this fun games. See you next times. Good bye!!!");
        sc.close();
    }

    public static boolean isValidMove(String move){
        //Paper, Rock, Scisor
        return move.equalsIgnoreCase("Rock") || 
               move.equalsIgnoreCase("Scisor") ||
               move.equalsIgnoreCase("Paper");
    }
    
}
