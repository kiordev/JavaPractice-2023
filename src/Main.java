import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      System.out.println("Calculator");
      System.out.println("Choose your action: ");
      System.out.println("+ - * /");
      char user_action;
      Scanner user_action_enter = new Scanner(System.in);
      user_action = user_action_enter.next().charAt(0);
      System.out.println("Enter your nums");
      float a, b;
      float result;
      Scanner num = new Scanner(System.in);
      a = num.nextFloat();
      b = num.nextFloat();

      if(user_action=='+'){
          result = a+b;
          System.out.println("Result is: "+result);
      }
      else if(user_action=='-'){
          result = a-b;
          System.out.println("Result is: "+result);
      }
      else if(user_action=='*'){
          result = a*b;
          System.out.println("Result is: "+result);
      }
      else if(user_action=='/'){
          result = a/b;
          System.out.println("Result is: "+result);
      }

    }
}
