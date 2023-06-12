/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package currencyconverterproject;

/**
 *
 * @author haziq
 */
public class BillError extends Exception {

    public BillError() {
        super("Transfer transaaction is required ");
    }
    
    public String getMessage(){
    return ("Transfer transaaction is required ");
    }

    public BillError(String msg) {
        super(msg);
    }
}
