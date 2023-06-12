/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package employeeinformationapplication;

/**
 *
 * @author haziq
 */
public class NewInvalidUserException extends Exception {

    /**
     * Creates a new instance of <code>NewInvalidUserException</code> without
     * detail message.
     */
    public NewInvalidUserException() {
        super("Your Username or password is Invalid");
    }

    /**
     * Constructs an instance of <code>NewInvalidUserException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NewInvalidUserException(String msg) {
        super(msg);
    }
}
