import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Rock=0
        //Paper=1
        //Scissor=2
        System.out.println("Rock = 0,Paper = 1,Scissor = 2");
        Scanner sc=new Scanner(System.in);
        int user_input = sc.nextShort();
        Random random = new Random();
        int computer_input = random.nextInt(3);
        if(computer_input == 0) {
            System.out.println("Computer choosed Rock ");
        } else if (computer_input == 1) {
            System.out.println("Computer choosed Paper");
        }
        else {
            System.out.println("Computer choosed Scissor");
        }
        if(user_input == computer_input){
            System.out.println("Draw");
        } else if ((user_input == 0 && computer_input==2) || (user_input==1 && computer_input== 0)||
                (user_input == 2 && computer_input==1)) {
            System.out.println("You Won");
        }else{
            System.out.println("You Lose");
        }
    }
}