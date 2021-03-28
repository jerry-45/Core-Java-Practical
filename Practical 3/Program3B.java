import java.util.Scanner; 
public class Program3B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to calculate sum of digits");
        int number = sc.nextInt(); 
        int sum = 0; 
        int input = number;
        while (input != 0){
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10; 
        }
        System.out.printf("Sum of digits of number %d is %d", number, sum);
        sc.close();
    }
}