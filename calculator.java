import java.util.Scanner;
public class calculator{
    static void addition(int x,int y){
        System.out.println("= "+ (x + y));
    }
    static void subtraction(int x, int y){
        System.out.println("= " + (x - y));
    }
    static void multiplication(int x, int y){
        System.out.println("= " + (x*y));
    }
    static void division(int x, int y){
        System.out.println("= " + x/y);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
        int num1 = input.nextInt();
        
        input.nextLine();
        String operator = input.nextLine();
        
        System.out.print("Second Number: ");
        int num2 = input.nextInt();
        
        if(operator.equals("+")){
            addition(num1, num2);
        }
        else if(operator.equals("-")){
            subtraction(num1, num2);
        }
        else if(operator.equals("*")){
            multiplication(num1, num2);
        }
        else if(operator.equals("/")){
            division(num1, num2);
        }
        input.close();
    }
}