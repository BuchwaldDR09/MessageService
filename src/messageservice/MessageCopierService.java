package messageservice;

/**
 *
 * @author Dan
 */
public class MessageCopierService {

    private MessageReader reader;
    private MessageWriter writer;
    private String line;

    public MessageCopierService(MessageReader reader, MessageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void copyMessage() {
        line = reader.readMessage();
        writer.writeMessage(line);
    }

    public void readMessage() {
        line = reader.readMessage();
    }

    public void writeMessage() {
        writer.writeMessage(line);
    }

    public MessageReader getReader() {
        return reader;
    }

    public void setReader(MessageReader reader) {
        this.reader = reader;
    }

    public MessageWriter getWriter() {
        return writer;
    }

    public void setWriter(MessageWriter writer) {
        this.writer = writer;
    }
}
