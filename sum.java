import java.util.Scanner;

public class sum {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number");
     long first = sc.nextLong();
     System.out.println("Enter the second number");
     long second = sc.nextLong();
     long sum = first+second;
     System.out.println("The sum is " + sum);
     sc.close();
    }
}
