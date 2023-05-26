import java.util.Scanner;

public class LCM {
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1, num2, lcm;

      System.out.print("Enter first number: ");
      num1 = input.nextInt();

      System.out.print("Enter second number: ");
      num2 = input.nextInt();

      lcm = (num1 > num2) ? num1 : num2;

      while(true) {
         if( lcm % num1 == 0 && lcm % num2 == 0 ) {
            System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
            break;
         }
         ++lcm; 
      }
   }
}

    
        
