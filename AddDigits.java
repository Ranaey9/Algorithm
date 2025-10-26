
import java.util.Scanner;

public class AddDigits {
    public int AddDigits(int num){
        int c,d;
        while(num >= 10){
            c = num / 10;
            d = num % 10;
            num = c + d;
        }
        return num;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        
        AddDigits addDigits = new AddDigits();
        int result = addDigits.AddDigits(num);
        
        System.out.println("The result after repeatedly adding digits is: " + result);
        
        scanner.close();
    }
}