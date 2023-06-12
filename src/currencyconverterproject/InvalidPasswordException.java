/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package currencyconverterproject;

/**
 *
 * @author haziq
 */
public class InvalidPasswordException extends Exception {

    public InvalidPasswordException() {
        super("Your Password is Invalid");
    }
    
    public String getMessage(){
    return ("Your Password is Invalid ");
    }

    public InvalidPasswordException(String msg) {
        super(msg);
    }
}
