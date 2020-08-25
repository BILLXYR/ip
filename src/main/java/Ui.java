import java.util.Scanner;

public class Ui {

    private static final String horizontal_line = "------------------------------------------";
    private static final String logo = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";

    private Scanner scanner;
    public Ui() {
        scanner = new Scanner(System.in);
    }
    
    public String getInput() {
        return scanner.nextLine();
    }
    
    public void printHorizontalLine() {
        System.out.println(horizontal_line);
    }
    
    public static void welcome_message() {
        System.out.println("Hello from Bill \n" + logo);
        System.out.println(horizontal_line);
        System.out.println("Hello! I'm Bill ");
        System.out.println("What Can I do for you? ");
        System.out.println(horizontal_line);
    }

    public static void session_end() {
        System.out.println(horizontal_line);
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println(horizontal_line);
    }
}