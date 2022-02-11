import java.util.Scanner;
import java.util.Random;
public class myapp {
    
    public static void main(String[] args) { 
        Integer answer = new Random().nextInt(10) + 1;

        while(true){
    System.out.println("Your guess?");
        //String name =new Scanner(System.in).nextInt();
        Integer guess = new Scanner(System.in).nextInt();
        //String name = "take";
        if (answer == guess) {
            System.out.println("Bingo!");
            break;
        }else if(answer > guess){
    System.out.println("The answer is higher!");
        
        } else {
            System.out.println("The answer is lower!");
        }
            }


        
        //System.out.println("Your guess:" +guess);


    }


}
