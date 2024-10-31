import java.util.Scanner;

public class scoreAndGrades {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your Mark : ");
        double userMark = Double.parseDouble(read.nextLine());
        if (userMark >= 95) {
            System.out.println("Nerd !!!!");
        } else if (userMark >= 90 && userMark < 95) {
            System.out.println("Noice boi");
        } else if (userMark >= 50 && userMark < 90) {
            System.out.println("Good work");
        } else {
            System.out.println("Padi da parama :/");
        }
    }
}
