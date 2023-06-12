/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package currencyconverterproject;

/**
 *
 * @author haziq
 */
public class NegativeValue extends Exception {

    public NegativeValue() {
        super("Please enter the positive value only");
    }

    public NegativeValue(String msg) {
        super(msg);
    }
}
