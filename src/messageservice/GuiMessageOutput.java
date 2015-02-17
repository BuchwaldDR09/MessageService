package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class GuiMessageOutput implements MessageWriter {

    @Override
    public void writeln(String line) {
        JOptionPane.showMessageDialog(null, line);
    }
}
