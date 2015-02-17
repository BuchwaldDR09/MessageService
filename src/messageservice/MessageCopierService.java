package messageservice;

/**
 *
 * @author Dan
 */
public class MessageCopierService {

    private MessageReaderStrategy reader;
    private MessageWriterStrategy writer;
    private String line;

    public MessageCopierService(MessageReaderStrategy reader, MessageWriterStrategy writer) {
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

    public MessageReaderStrategy getReader() {
        return reader;
    }

    public void setReader(MessageReaderStrategy reader) {
        this.reader = reader;
    }

    public MessageWriterStrategy getWriter() {
        return writer;
    }

    public void setWriter(MessageWriterStrategy writer) {
        this.writer = writer;
    }
}
