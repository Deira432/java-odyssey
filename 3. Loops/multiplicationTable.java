import java.util.Scanner;

public class multiplicationTable{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);        
        System.out.print("Enter the multiplication table you want : ");
        int table = Integer.parseInt(read.nextLine());
        System.out.print("Enter the limit : ");
        int limit = Integer.parseInt(read.nextLine());

        for(int i = 1; i <= limit; i++)
            System.out.printf("%d * %d = %d\n", table, i, table * i);
    }
}
