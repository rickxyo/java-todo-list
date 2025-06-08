import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Welcome to your To Do List!");
            System.out.println("1 - Add task");
            System.out.println("2 - Remove task");
            System.out.println("3 - Edit task");
            System.out.println("4 - Show all tasks");
            System.out.println("5 - Exit");
            int number = scanner.nextInt();
        }

    }
}