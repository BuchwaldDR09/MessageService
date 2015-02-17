package messageservice;

/**
 *
 * @author Dan
 */
public class MessageCopier {

    private MessageReader reader;
    private MessageWriter writer;
    private String line;

    public MessageCopier(MessageReader reader, MessageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void copy() {
        line = reader.readln();
        writer.writeln(line);
    }

    public void readLine() {
        line = reader.readln();
    }

    public void writeLine() {
        writer.writeln(line);
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
