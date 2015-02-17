package messageservice;

/**
 *
 * @author Dan
 */
public interface MessageWriterStrategy {

    public abstract void writeMessage(String line);
}
