import java.util.Scanner;
import java.util.Random;
public class numberGuess{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int computerChoice = random.nextInt(50);
        //set value to be incorrect by default 
        int userChoice = -1;
        int guessCount = 0;

        
        while(userChoice != computerChoice){
            System.out.println("Enter your number");
            userChoice = input.nextInt();
            
            if (userChoice > computerChoice){
                System.out.println("Too high try again");    
                guessCount ++;                
            }
            else if(userChoice < computerChoice){
                System.out.println("Too low try again");
                guessCount ++;
            }
            else if(userChoice == computerChoice){
                System.out.println("Correct guess");
                System.out.printf("It took you %d guesses.", guessCount);
            }
        }
        input.close();
    }
}
