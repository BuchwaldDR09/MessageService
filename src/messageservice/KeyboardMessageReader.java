package messageservice;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class KeyboardMessageReader implements MessageReaderStrategy {

    @Override
    public String readMessage() {
        System.out.println("Enter your message here: ");

        Scanner messageInput = new Scanner(System.in);
        return messageInput.nextLine();
    }
}
