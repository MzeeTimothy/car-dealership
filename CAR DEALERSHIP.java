import java.io.Console;

public class AuthenticationSystem {
    public static void main(String[] args) {
        Console console = System.console(); // Use system console for password hiding
        if (console == null) {
            System.out.println("Console is not available.");
            return;
        }

        String correctUsername = "Timothy";
        String correctPassword = "111am";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = console.readLine(); // Read full username input
            
            char[] passwordArray = console.readPassword("Enter password: "); // Mask password input
            String password = new String(passwordArray); // Convert array to String
            
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect login. Attempts remaining: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Access denied!!!");
        }
    }
}