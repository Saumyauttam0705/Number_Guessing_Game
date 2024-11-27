import java.util.Scanner;
public class gusseingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //generate reandom number
        
        int num = (int) (Math.random() * 99 + 1);

        int guess;
        int numGuesses = 5;

        while(numGuesses > 0){
            System.out.println("Guess a number between 1 to 100 : ");
            guess = sc.nextInt();

            if(guess == num){
                System.out.println("Congratulations! You got the number which is " + num);
                break;
            }
            else if (guess < num){
                System.out.println("Too low");
            }
            else{
                System.out.println("Too high");
            }
            numGuesses--;
            if(numGuesses == 0){
                System.out.println("You ran out of guesses , the number was :" + num);
            }
        }
        if(numGuesses >= 3){
            System.out.println("You played well!! Your score is 90");
        }
        else{
            System.out.println("You did a good job");
        }
    }
}
