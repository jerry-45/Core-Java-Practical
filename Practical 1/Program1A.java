import java.util.Scanner;

public class Program1A{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num1 = in.nextInt();

        for(int i = 0;i<10;i++){
            System.out.println(num1 + " x " + (i+1) + 
                                " = " + (num1*(i+1)));

        }
    }
}