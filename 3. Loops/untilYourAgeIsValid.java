import java.util.*;

public class untilYourAgeIsValid {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age = 18;
        int count = 0;
        do {
            System.out.print("Enter valid age: ");
            age = Integer.parseInt(read.nextLine());
            count += 1;
        } while (age <= 18);

        System.out.printf((count > 1) ? "Okay Valid Age !! But took you %d attempts : |" : "Okay Valid Age !!", count);
    }
}
