import java.util.Scanner;
public class day3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if ( num < 0 ){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is positive");
        }


    }
    
}
