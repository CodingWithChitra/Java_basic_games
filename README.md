# លំហាត់ហ្គេមក្នុងមេរៀន Java ថ្នាក់ទី១
1. ហ្គេមទាយលេខ - Guessing Number
2. ហ្គេមប៉ាវស៊ីងស៊ុង - Rock, Paper, Scissors
3. ម៉ាស៊ីនគិតលេខសាមញ្ញា - Simple Calculator
4. FizzBuzz
5. Even or Odd
6. Simple Menu
7. ម៉ាស៊ីនគិតលេខ Factorial - Factorial Calculator
8. Reverse a String 
9. រាប់ស្រៈ និងព្យញ្ជនៈ
10. Simple Password Validator

  ## ប្រសិនជាចង់ទិញកាហ្វេអោយខ្ញុំអ្នកទាំងអស់គ្នាអាចចូលរួមតាមរយ:៖  
  ### 🏦 ACLEDA : 086457324  
  ### 🏦 ABA    : 086457324

## 1.ហ្គេមទាយលេខ
### បង្កើតហ្គេមទាយលេខសាមញ្ញមួយដែលកម្មវិធីជ្រើសរើសលេខដោយចៃដន្យរវាងលេខ
 1 ដល់ 100។ 
អ្នកប្រើប្រាស់ត្រូវទាយលេខ ហើយកម្មវិធីនេះផ្តល់ការណែនាំប្រសិនបើការទាយខ្ពស់ពេក ឬទាបពេក។
ប្រសិនជាទាញខុសចំនួន៥ដងនោះនឹងចាញ់ដោយស្វ័យប្រវត្ត។

 ក្នុងលំហាត់នេះអ្នកទាំងអស់គ្នានឹងចេះអំពីការប្រើប្រាសកាន់តែច្បាស់នូវចំណុច ដូខខាងក្រោមនេះ៖
1. java.util.Scanner  
   - អោយអ្នកប្រើប្រាស់ទាយលេខអោយបានត្រឹមត្រូវ
2. java.util.Random  
   - អោយ System បញ្ចេញលេខចៃដន្យ ពី​ ០ ទៅ ដល់ ១០០
3. while loop statement  
   - យល់ដឹងអំពីរបៀបប្រើប្រាស់ Loop(វិលជុំ) កាន់តែច្បាស់
   ### While Loop Statement
<img src="https://github.com/CodingWithChitra/Java_basic_games/blob/main/resources/while-loop-statement.png" alt="While Loop Statement" width="800"/>

4. else-if ladder  
   - យល់ដឹងអំពីការប្រើប្រាស់ else-if ladder កាន់តែច្បាស់
### Else-If Ladder
<img src="https://github.com/CodingWithChitra/Java_basic_games/blob/main/resources/else-if-ladder.png" alt="Else if Ladder" width="800"/>

5. break statement  
   - យល់ថាតើយើងគួរតែប្រើប្រាស់ break នៅពេលណា
### Break Statement
<img src="https://github.com/CodingWithChitra/Java_basic_games/blob/main/resources/break.png" alt="Break Statement" width="800"/>

### គាំទ្រខ្ញុំតាមរយ:
<img src="https://github.com/CodingWithChitra/Java_basic_games/blob/main/resources/qrcode.png" alt="Else if Ladder" width="800"/>
   

  
## 2. ហ្គេមប៉ាវស៊ីងស៊ុង - Rock, Paper, Scissors
  ## ប្រសិនជាចង់ទិញកាហ្វេអោយខ្ញុំអ្នកទាំងអស់គ្នាអាចចូលរួមតាមរយ:៖  
  ### 🏦 ACLEDA : 086457324  
  ### 🏦 ABA    : 086457324
  
### បង្កើតហ្គេមទាយលេខសាមញ្ញមួយដែលកម្មវិធីជ្រើសរើសលេខដោយចៃដន្យរវាងលេខ
## Explanation

### Imports and Initialization
- Scanner is used to read user input.
- Random is used to generate the computer's move.
### Main Game Loop
- The game runs in a loop, allowing the user to play multiple rounds until they choose to exit.
- The user is prompted to enter their move or type "Exit" to quit the game.
### Input Validation
- The isValidMove method checks if the user's move is valid (Rock, Paper, or Scissors).
Computer's Move
- The computer randomly selects a move from the rps array.
### Determine the Winner
- The game checks the user's move against the computer's move to determine the winner or if it's a tie.
End the Game
- If the user types "Exit," the game loop ends, and a thank you message is displayed.

# Rock-Paper-Scissors Game

This repository contains a simple Rock-Paper-Scissors game implemented in Java.

## Java Code

```java
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter move (Rock, Paper, Scissors). To exit the game, type Exit:");
            String userMove = scanner.nextLine();

            if (userMove.equalsIgnoreCase("Exit")) {
                playAgain = false;
            } else if (isValidMove(userMove)) {
                int computerIndex = random.nextInt(3);
                String computerMove = rps[computerIndex];

                System.out.println("Computer move: " + computerMove);

                if (userMove.equalsIgnoreCase(computerMove)) {
                    System.out.println("It's a tie!");
                } else if (userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")
                        || userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")
                        || userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("Rock") || move.equalsIgnoreCase("Paper") || move.equalsIgnoreCase("Scissors");
    }
}
```


### គាំទ្រខ្ញុំតាមរយ:
<img src="https://github.com/CodingWithChitra/Java_basic_games/blob/main/resources/qrcode.png" alt="Else if Ladder" width="800"/>
   
