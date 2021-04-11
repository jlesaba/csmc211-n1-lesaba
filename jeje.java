import java.util.Scanner;
import java.text.NumberFormat;

public class jeje{
  public static void main(String[] args){
    String INPUT;
    String translation = "";
    int NUMBER_OF_CHARACTERS_REPLACED = 0;
    float PERCENTAGE_OF_CHARACTERS_REPLACED;

    Scanner scan = new Scanner(System.in);
    NumberFormat fmt = NumberFormat.getPercentInstance();

    System.out.print("Input a string: ");
    INPUT = scan.nextLine();

    for(int i=0; i<INPUT.length();i++){
      if(INPUT.charAt(i) == 'a'){
        translation = translation.concat("@");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'b'){
        translation = translation.concat("8");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'c'){
        translation = translation.concat("(");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'e'){
        translation = translation.concat("3");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'h'){
        translation = translation.concat("#");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'i'){
        translation = translation.concat("!");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'k'){
        translation = translation.concat("&");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'o'){
        translation = translation.concat("0");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 's'){
        translation = translation.concat("$");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else if(INPUT.charAt(i) == 'x'){
        translation = translation.concat("+");
        NUMBER_OF_CHARACTERS_REPLACED++;
      }else{
        translation = translation.concat(INPUT.substring(i, i+1));
      }
    }

    float tmp = NUMBER_OF_CHARACTERS_REPLACED;
    PERCENTAGE_OF_CHARACTERS_REPLACED = tmp / INPUT.length();

    System.out.println("Jejemon: " + translation);
    System.out.println("\nNumber of Characters Replaced: " + NUMBER_OF_CHARACTERS_REPLACED);
    System.out.println("Percentage of Characters Replaced: " + fmt.format(PERCENTAGE_OF_CHARACTERS_REPLACED));
  }
}
