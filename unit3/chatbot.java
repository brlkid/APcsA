
import java.util.Scanner;

public class chatbot {
        public static void main(String [] args)
    {
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println(responses.printthis());
            statement = in.nextLine();
        }
    }
}
