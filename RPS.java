import java.util.Scanner;
import java.util.Random;

public class RPS{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        String[] choiceArr = {"Rock", "Paper", "Scissors"};

        System.out.print("How many games would you like to play: ");
        int rounds = input.nextInt();
        //buffer flush 
        input.nextLine();
        int userScore = 0;
        int computerScore = 0;
        for(int round = 0; round < rounds; round++){
            int computerChoiceMap = rnd.nextInt(3);
            String computerChoice = choiceArr[computerChoiceMap];

            System.out.print("User Choice: ");
            String userChoice = input.nextLine();

            if(computerChoice.equals("Rock")){
                if(userChoice.equals("Rock")){
                    System.out.println("DRAW");
                }
                else if(userChoice.equals("Paper")){
                    System.out.println("User Wins");
                    userScore ++;
                }
                else if(userChoice.equals("Scissors")){
                    System.out.println("Computer Wins");
                    computerScore++;
                }
            }
            else if(computerChoice.equals("Paper")){
                if(userChoice.equals("Paper")){
                    System.out.println("DRAW!");
                }
                else if(userChoice.equals("Scissors")){
                    System.out.println("User Wins");
                    userScore++;
                }
                else if(userChoice.equals("Rock")){
                    System.out.println("Computer Wins");
                    computerScore++;
                }
            }
            else if(computerChoice.equals("Scissors")){
                if(userChoice.equals("Scissors")){
                    System.out.println("DRAW!");
                }
                else if(userChoice.equals("Rock")){
                    System.out.println("User Wins");
                    userScore++;
                }
                else if(userChoice.equals("Paper")){
                    System.out.println("Computer Wins");
                    computerScore++;
                }
            }
            else{
                System.out.println("Incorrect input or mismatch");
            }
        }
        if(userScore > computerScore){
            System.out.println("User Wins");
        }
        else if(computerScore > userScore){
            System.out.println("Computer Wins");
        }
        else if(computerScore == userScore){
            System.out.println("Draw");
        }
        input.close();   
    }
}

