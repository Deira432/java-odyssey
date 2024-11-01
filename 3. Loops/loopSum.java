import java.util.Scanner;

public class loopSum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = Integer.parseInt(read.nextLine());
        int count = 0;
        while(!(num < 0)){
            System.out.printf("Your new sum is : %d", count + num);
            count += num;
            System.out.println("\nEnter number : ");
            num = Integer.parseInt(read.nextLine());
        }
        System.out.printf("Final sum : %d ", count);
        System.out.println("\nYo its a negative number.... no negative. nada");
    }
}