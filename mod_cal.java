import java.util.Scanner;
import java.lang.Math;

public class mod_cal{
  public static void main(String[] args){
    float NUM1, NUM2;
    String OPERATOR;

    Scanner input = new Scanner(System.in);

    System.out.print("Please input NUM1: ");
    NUM1 = input.nextFloat();
    System.out.print("Please input NUM2: ");
    NUM2 = input.nextFloat();
    System.out.print("Please input an OPERATOR: ");
    OPERATOR = input.next();

    if(OPERATOR.equals("+")){
      System.out.println("Output: " + (NUM1 + NUM2));
    }else if(OPERATOR.equals("-")){
      System.out.println("Output: " + (NUM1 - NUM2));
    }else if(OPERATOR.equals("*")){
      System.out.println("Output: " + (NUM1 * NUM2));
    }else if(OPERATOR.equals("/")){
      System.out.println("Output: " + (NUM1 / NUM2));
    }else if(OPERATOR.equals("%")){
      System.out.println("Output: " + (NUM1 % NUM2));
    }
    //New binary operators
    else if(OPERATOR.equals("^")){
      System.out.println("Output: " + Math.pow(NUM1, NUM2));
    }else if(OPERATOR.equals("@")){
      System.out.println("Output: " + (NUM1 * 2 + NUM2 * 2));
    }else if(OPERATOR.equals("!!")){
      System.out.println("Output: " + NUM1);
    }else if(OPERATOR.equals("$$")){
      System.out.println("Output: " + NUM2);
    }

    else{
      System.out.println("INVALID OPERATOR");
    }
  }
}
