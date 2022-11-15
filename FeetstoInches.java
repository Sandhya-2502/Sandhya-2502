import java.util.Scanner;
    
    public class FeetstoInches
    
    {
      public static void main(String[] args)
       
       {
          double feet;

          Scanner in = new Scanner (System.in);

          System.out.println("Please enter feet: ");

          feet = in.nextDouble();

          double inches = feet * 12;

          System.out.println(inches + "Inches");
  
         }
      }