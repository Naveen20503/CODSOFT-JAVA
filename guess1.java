import java.util.Scanner;
import java.util.Random;

public class guess1 {
    public static void main(String[] args) {
        generatorRandom();
    }

    public static void generatorRandom() {
        // creating object of random class
        Random rand = new Random();
        // genrating a random number between 0-100
        int randomNum = rand.nextInt(11);
        guess(randomNum);
    }

    public static void guess(int randomNum) {
    Scanner  in = new Scanner(System.in);
    System.out.println("");
    System.out.println("Number Guessing Game");
    System.out.println("Guess a number between 0-10 : ");
    int guess = in.nextInt();
    System.out.println("");


    while (guess < 0 || guess>10){
        System.out.println("Guess a number between 0-10 :  ");
        guess = in.nextInt();
        System.out.println("");
    }
    int tries = 0;
    while(guess != randomNum){
    tries++;
    System.out.println("Worng Guess !");
    System.out.print("Guess again : ");
    guess = in.nextInt();
    System.out.println("");
    
    while (guess < 0 || guess>10){
        System.out.println("Guess a number between 0-10 :  ");
        guess = in.nextInt();
        System.out.println("");
    }
    }
    System.out.println("correct answer : YOU WIN $");
    System.out.println(" Wrong tries:  "+tries);
    System.out.println("");
    //play again or exist
    System.out.println("Press 1 to play again  ");
    System.out.println(" Press 0 to Exist  ");
    int choice = in.nextInt();
    if (choice==1)
    generatorRandom();
    else
    return;
}
}