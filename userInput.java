import java.util.Scanner;
public class userInput {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ");
        String name = scanner.nextLine();

        System.out.println("What is your age :");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter your fav food : ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name+" You are "+age+" years old.");
        System.out.println("Your fav food is "+food);

    }
}
