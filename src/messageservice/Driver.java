package messageservice;

/**
 *
 * @author Dan
 */
public class Driver {

    public static void main(String[] args) {

        MessageReaderStrategy freader = new MessageFileReader();
        MessageWriterStrategy fwriter = new MessageFileWriter();

        MessageReaderStrategy reader = new KeyboardMessageReader();
        MessageWriterStrategy writer = new GuiMessageOutput();
        MessageCopierService copier = new MessageCopierService(reader, writer);
        //Copier copier = new Copier( freader, fwriter );
        copier.copyMessage();

        copier.setWriter(fwriter);
        copier.writeMessage();
//
        // Send end of program message
        System.out.println("\ncopied successfull.\n");
        
        MessageWriterStrategy cwriter = new ConsoleMessageWriter();
        //copier.setReader(freader);
        copier.setWriter(cwriter);
        copier.writeMessage();
                

        
    }

}
