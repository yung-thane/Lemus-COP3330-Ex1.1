import java.util.Scanner;

public class SayingHello {
   public static void main(String[] args){
       System.out.print("What is your name?");
       Scanner name = new Scanner(System.in);

        String name1 = name.nextLine();

       System.out.printf("%s%s%s","Hello, ",name1," nice to meet you!");
   }
}
