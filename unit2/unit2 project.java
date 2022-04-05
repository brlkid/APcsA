public class Main 
{
  public static void main(String []args)
  {

    //Creates 4 new instances of the Student object

    Student student1 = new Student();
    Student student2 = new Student();

    Student student3 = new Student("John", "Geometry", 93);
    Student student4 = new Student("Abby", "Art II", 78);

    System.out.println();
    
    //Prints all the information for student 1
    
    System.out.println("Student Name: " + student1.getName());
    System.out.println("Student Course: " + student1.getCourse());
    System.out.println("Student Grade: " + student1.getGrade());
    System.out.println("Number Of Scores/Total Points: " + student1.getNumScores() + "/" + student1.getPoints());

    System.out.println();

    //Prints all the information for student 2

    System.out.println("Student Name: " + student2.getName());
    System.out.println("Student Course: " + student2.getCourse());
    System.out.println("Student Grade: " + student2.getGrade());
    System.out.println("Number Of Scores/Total Points: " + student2.getNumScores() + "/" + student2.getPoints());

    System.out.println();

    //Prints all the information for student 3

    System.out.println("Student Name: " + student3.getName());
    System.out.println("Student Course: " + student3.getCourse());
    System.out.println("Student Grade: " + student3.getGrade());
    System.out.println("Number Of Scores/Total Points: " + student3.getNumScores() + "/" + student3.getPoints());

  System.out.println();

    //Prints all the information for student 4
    
    System.out.println("Student Name: " + student4.getName());
    System.out.println("Student Course: " + student4.getCourse());
    System.out.println("Student Grade: " + student4.getGrade());
    System.out.println("Number Of Scores/Total Points: " + student4.getNumScores() + "/" + student4.getPoints());

    //Gives all of the students scores according to      the rules given

    student1.addScore(47);
    student1.addScore(96);

    student2.addScore(92);
    student2.addScore(93);
    student2.addScore((int) Math.random()*42 + 65);
    student2.addScore((int) Math.random()*42 + 85);


    student3.addScore(99);
    student3.addScore(100);
    student3.addScore(88);
    student3.addScore((int) Math.random()*71 + 55);
    student3.addScore((int) Math.random()*75 + 40);
    student3.addScore((int) Math.random()*70 + 40);

    student4.addScore(42);
    student4.addScore(31);
    student4.addScore(55);
    student4.addScore((int) Math.random()*100+100);
    student4.addScore((int) Math.random()*100+100);
    //Me and Jacob came up with a genius plan to help the kids! 
    student4.addScore((int) Math.random()*100);

    //Assigns values to students 1 and 2's attributes because they were previously default 

    student1.setName("Dylan");
    student1.setGrade(68);
    student1.setCourse("Science Research");

    student2.setName("Jennifer");
    student2.setGrade(14);
    student2.setCourse("Algebra II");

    //Chops off the beginning of the string 
    
    String student3Course = student3.getCourse();
    student3Course = student3Course.substring(6, student3Course.length());

    String student4Course = student4.getCourse();
    student4Course = student4Course.substring(6, student4Course.length());

    System.out.println("---------------------");

    //Prints out all the newly changed information

    System.out.println("Student Name: " + student1.getName());
    System.out.println("Student Course: " + student1.getCourse().substring(6,student1.getCourse().length()));
    System.out.println("Student Grade: " + student1.getGrade());
    System.out.println("Student has "  + student1.getPoints() + " from " + student1.getNumScores() + " score for a GPA of " + (student1.getPoints() / student1.getNumScores()));

    System.out.println();

    System.out.println("Student Name: " + student2.getName());
    System.out.println("Student Course: " + student2.getCourse().substring(6,student2.getCourse().length()));
    System.out.println("Student Grade: " + student2.getGrade());
    System.out.println("Student has "  + student2.getPoints() + " from " + student2.getNumScores() + " scores for a GPA of " + (student2.getPoints() / student2.getNumScores()));

    System.out.println();

    System.out.println("Student Name: " + student3.getName());
    System.out.println("Student Course: " + student3.getCourse().substring(6,student3.getCourse().length()));
    System.out.println("Student Grade: " + student3.getGrade());
    System.out.println("Student has "  + student3.getPoints() + " from " + student3.getNumScores() + " scores for a GPA of " + (student3.getPoints() / student3.getNumScores()));

    System.out.println();

    System.out.println("Student Name: " + student4.getName());
    System.out.println("Student Course: " + student4.getCourse().substring(6,student4.getCourse().length()));
    System.out.println("Student Grade: " + student4.getGrade());
    System.out.println("Student has "  + student4.getPoints() + " from " + student4.getNumScores() + " scores for a GPA of " + (student4.getPoints() / student4.getNumScores()));
    
  }
}
