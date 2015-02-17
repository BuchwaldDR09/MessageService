package messageservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Dan
 */
public class MessageFileWriter implements MessageWriter {

    public void writeMessage(String line) {
        boolean append = false;
        File data = new File(File.separatorChar + "Temp"
                + File.separatorChar + "datacopy.txt");
        PrintWriter out = null;

		
        try {
			
            out = new PrintWriter(
                    new BufferedWriter(
                            new java.io.FileWriter(data, append)));
            out.println(line);
            out.close();

        } catch (IOException ioe) {
            if (out != null) {
                out.close();
            }
            System.out.println(ioe.getMessage());
            System.exit(1); 
        }

    }

}
