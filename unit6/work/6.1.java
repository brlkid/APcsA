public class Test1 
{
   public static void main(String[] args)
   {
     // declare, create, initialize arrays
     int[ ] highScores = {99,98,98,88,68};
     String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};
     for (int counter = 0; counter<highScores.length; counter++)
     {
     System.out.println(names[counter] + " has a score of " + highScores[counter]);
     }
   }
}