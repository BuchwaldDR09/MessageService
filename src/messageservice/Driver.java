package messageservice;

/**
 *
 * @author Dan
 */
public class Driver {

    public static void main(String[] args) {

        MessageReader freader = new MessageFileReaderStrategy();
        MessageWriter fwriter = new MessageFileWriterStrategy();

        MessageReader reader = new KeyboardMessageReader();
        MessageWriter writer = new GuiMessageOutputStrategy();
        MessageCopierService copier = new MessageCopierService(reader, writer);
        //Copier copier = new Copier( freader, fwriter );
        copier.copyMessage();

        copier.setWriter(fwriter);
        copier.writeMessage();
//
        // Send end of program message
        System.out.println("\ncopied successfull.\n");
        
        MessageWriter cwriter = new ConsoleMessageWriterStrategy();
        //copier.setReader(freader);
        copier.setWriter(cwriter);
        copier.writeMessage();
                

        
    }

}
