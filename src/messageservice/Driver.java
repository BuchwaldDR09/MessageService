package messageservice;

/**
 *
 * @author Dan
 */
public class Driver {

    public static void main(String[] args) {

        MessageReader freader = new MessageFileReader();
        MessageWriter fwriter = new MessageFileWriter();

        MessageReader reader = new KeyboardMessageReader();
        MessageWriter writer = new GuiMessageOutputStrategy();
        MessageCopierService copier = new MessageCopierService(reader, writer);
        //Copier copier = new Copier( freader, fwriter );
        copier.copy();

        copier.setWriter(fwriter);
        copier.writeLine();
//
        // Send end of program message
        System.out.println("\ncopied successfull.\n");
        
        MessageWriter cwriter = new ConsoleMessageWriter();
        //copier.setReader(freader);
        copier.setWriter(cwriter);
        copier.writeLine();
                

        
    }

}
