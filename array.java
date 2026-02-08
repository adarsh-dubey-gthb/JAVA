import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];

        System.out.println("Enter 5 numbers");
        for (int i = 0 ; i<numbers.length; i++){
            System.out.println("Enter number "+(i+1)+":");
            numbers[i] = sc.nextInt(); 
        }
        System.out.println("\nArray elements: ");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        sc.close();
        
    }
}
