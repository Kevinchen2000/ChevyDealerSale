/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Validator {    
    
    public static boolean isTextFieldNotEmpty(JTextField t)
    {
        if (t.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(t, "Enter a " + t.getName() + "!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            t.requestFocusInWindow();
            return false;
        }
        else
            return true;
    }
    
    public static boolean isTextFieldPositive(JTextField t)
    {
        if (isTextFieldNotEmpty(t))
        {
            try
            {
                double d = Double.parseDouble(t.getText());
                if (d > 0)
                    return true;
                else
                {
                    JOptionPane.showMessageDialog(t, t.getName() + " Must Be Greater Than Zero. Try again...", 
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    t.requestFocusInWindow();
                    t.selectAll();
                    return false;
                }                    
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(t, t.getName() + " Must Be a Number. Try again...", 
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
                t.requestFocusInWindow();
                t.selectAll();
                return false;
            }
        }
        else
            return false;
    }
    
    public static boolean isTextFieldNonNegative(JTextField t)
    {
        boolean bResult = false;
        try
        {
            double d = Double.parseDouble(t.getText());
            if (d >= 0)
                bResult = true;
            else
            {
                JOptionPane.showMessageDialog(t, t.getName() + " Cannot Be Less Than Zero. Try again...", 
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
                t.requestFocusInWindow();
                t.selectAll();                
            }                    
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(t, t.getName() + " Must Be a Number. Try again...", 
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
            t.requestFocusInWindow();
            t.selectAll();            
        }
        return bResult;
    }
    
    public static String formatNumber(double d)
    {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        return number.format(d);
    }

    public static String formatCurrency(double d)
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();        
        return currency.format(d);
    }
    
    
    
    
 
    
    
    
    
    
    
}
