package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class GuiMessageOutput implements MessageWriterStrategy {

    @Override
    public void writeMessage(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
}
