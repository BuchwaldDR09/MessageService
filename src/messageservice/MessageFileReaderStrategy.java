package messageservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Dan referenced from Jim Lombardo. Used to validate that there is text
 * in the file, if not throw an exception or return null.
 */
public class MessageFileReaderStrategy implements MessageReader {

    private boolean lineReadFlag = false;

    @Override
    public String readMessage() {

        File data = new File(File.separator + "Temp" + File.separator + "data.txt");
        BufferedReader in = null;
        String line = null;

        try {
            if (data.exists()) {

                in = new BufferedReader(new java.io.FileReader(data));
                line = in.readLine();
                in.close();
            } else {
                System.out.println("File not found - data.txt");
                line = null;
            }
        } catch (IOException ioe) {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe2) {
                System.out.println(ioe2.getMessage());
            }
            System.out.println(ioe.getMessage());
            System.exit(1);
        }

        if (lineReadFlag) {
            return null;
        } else {
            lineReadFlag = true;
            return line;
        }
    }

}
