import java.util.Random;
import java.util.Scanner;

public class GuessGame{

  public static void main(String[] args) {
    Random Random_number= new Random();
    int correct_guess=Random_number.nextInt(100);
    int turns=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You will get 10 turns!" );
    System.out.println("Best of luck!");
    System.out.println("Enter the number you are guessing:");

    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
        guess=scan.nextInt();
        turns++;

    if(guess==correct_guess) {
        win=true;
    }
    else if(i>8){
        System.out.println("You loose! the right number was: "+correct_guess);
        System.out.println("Thanks for Playing the Game...!!!");
        return;
    }
    else if(guess<correct_guess){
        i++;
        System.out.println("Your Guess is lower ! Your Turns left are: "+(10-i));
  
    }
    else if(guess>correct_guess) {
        i++;
        System.out.println("Your Guess Is Higher ! Your Turns left are: "+(10-i)); 
    }
}
    System.out.println("You win!");
    System.out.println("Then Random number was "+correct_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Thanks for Playing the Game...!!!");
    }
}