import java.util.Scanner;

public class numberGame
{
        public static void main(String[] args)
	{
        int number = (int)(Math.random()*100)+1;
        Scanner myInput = new Scanner( System.in );
        int done = 0;
        int counter = 0;
        while (done == 0)
        {
        System.out.println("Enter your guess: ");
        int guess = myInput.nextInt();
        if (guess==number)
        {
                System.out.println("You got it in "+counter+" trys");
                done = 1;
        }
        if (guess < number) 
        {
                System.out.println("too low");
        }
        if (guess > number)
        {
                System.out.println("too high");
        }
counter++;
}
    }
}