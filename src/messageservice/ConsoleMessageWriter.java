/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Dan
 */
public class ConsoleMessageWriter implements MessageWriter {

    public void writeln(String line) {
        System.out.println("New Message:");
        System.out.println(line);
    }
}
