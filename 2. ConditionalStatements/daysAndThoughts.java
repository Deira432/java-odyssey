import java.util.Scanner;

public class daysAndThoughts {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Day : ");
        String userDay = read.nextLine().toLowerCase();
        switch (userDay) {
            case "monday":
                System.out.println("Monday is the start of the week, and it’s also a reminder that coffee is the only solution.");
                break;
            case "tuesday":
                System.out.println("The day after Monday that reminds you that you still have four more days of not trying to slap a fellow co-worker.");
                break;
            case "wednesday":
                System.out.println("Halfway to the weekend, halfway to losing my mind.");
                break;
            case "thursday":
                System.out.println("It’s Thursday! Or as I like to call it, ‘Day 4 of the hostage situation.");
                break;
            case "friday":
                System.out.println("Hello, Friday. I've been looking for you since Monday.");
                break;
            case "saturday":
                System.out.println("Saturday is a day to sleep until you’re hungry and eat until you’re sleepy.");
                break;
            case "sunday":
                System.out.println("Sunday is a reminder that the weekend goes by too fast, and tomorrow is Monday again.");
            default:
                System.out.println("There are seven days in a week and this ain't one.");
                break;
        }
        read.close();
    }
}
