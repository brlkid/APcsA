public class agecalculator 
{
   public static void main(String[] args)
   {
       // Fill in values for these variables
       int currentYear = 2022;
       int birthYear = 2006;
       int dogBirthYear = 2012;
       int age = currentYear-birthYear;
       int dogAge =currentYear-dogBirthYear;
       int dogYearsAge = dogAge*7;
       System.out.print("you are ");
       System.out.println(age);
       System.err.print("Your dog is ");
       System.out.println(dogAge);
       System.out.print("Your dog is ");
       System.out.println(dogYearsAge);
   }
}