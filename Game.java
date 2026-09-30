import java.util.Scanner;
import java.util.Random;
public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int target = rd.nextInt(1 ,101);
        int attempts = 0;
        while(true)
        {
            System.out.println("Enter a number between 1 & 100: ");
            int guess = sc.nextInt();
            if(guess > target){ 
                System.out.println("Number is greater then target: "+guess);
                attempts++;
            }
            else if(guess == target){ 
                attempts++;
                System.out.println("You achieved the target: "+guess +" attempts: " +attempts);
                break;
            }
            else{
                attempts++;
                 System.out.println("Number is smaller then target: "+guess );
                }
        }
    }
}
