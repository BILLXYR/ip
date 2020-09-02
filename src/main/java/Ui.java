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


    /**
     * Returns the user input.
     * @return String of user input.
     */
    public String getInput() {
        return scanner.nextLine();
    }

    /**
     * Prints the horizontal line.
     */
    public void printHorizontalLine() {
        System.out.println(horizontal_line);
    }
    
    public String printLine() {
        return horizontal_line;
    }


    /**
     * Prints the welcome message
     */
    public static String welcome_message() {
        
        String message = "Hello from Bill \n" + logo + "\n";
        message = message + horizontal_line + "\n ";
        message = message + "Hello! I'm Bill \n" + "What Can I do for you? \n";
        message = message + horizontal_line + "\n ";
        System.out.println("Hello from Bill \n" + logo);
        System.out.println(horizontal_line);
        System.out.println("Hello! I'm Bill ");
        System.out.println("What Can I do for you? ");
        System.out.println(horizontal_line);
        
        return message;
    }

    /**
     * Prints the exit message.
     */
    public static void session_end() {
        System.out.println(horizontal_line);
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println(horizontal_line);
        
        
    }
    
    public static String exitMessage() {
        return horizontal_line + "\n" + "Bye. Hope to see you again soon! \n" + horizontal_line + "\n";
    }

    /**
     * Returns the error message.
     * @param message Error message.
     */
    public static String getErrorMessage(String message) {
        return "OOPS!!! " + message;
    }
}
