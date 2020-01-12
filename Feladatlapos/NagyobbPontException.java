/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class NagyobbPontException extends Exception {

    /**
     * Creates a new instance of <code>NagyobbPontException</code> without
     * detail message.
     */
    public NagyobbPontException() {
        
    }

    /**
     * Constructs an instance of <code>NagyobbPontException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NagyobbPontException(String msg) {
        super(msg);
    }
    
    @Override
    public String toString(){
        return "nagyobb pontot adott meg!";
    }
}
