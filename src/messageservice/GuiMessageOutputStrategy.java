package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class GuiMessageOutputStrategy implements MessageWriter {

    @Override
    public void writeMessage(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
}
