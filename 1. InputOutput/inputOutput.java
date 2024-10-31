import java.util.Scanner;

class inputOutput{
public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        System.out.println("-------------------------------");
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(read.nextLine());
        System.out.println("-------------------------------");
        System.out.println("Enter your favourite color: ");
        String color = read.nextLine();
        read.close();
        System.out.println("-------------------------------");
        System.out.println("Now Akinator will guess about you.............");
        System.out.printf("Your name is %s. Your age is %d. Your favourite color is %s.", name, age, color);
    }
}