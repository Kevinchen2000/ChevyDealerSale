/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.text.NumberFormat;


public class Formatter {

    public static String formatNumber(double d)
    {
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);
        return n.format(d);
                
    }
    
    public static String formatCurrency (double d)
    {
        NumberFormat n = NumberFormat.getCurrencyInstance();
        return n.format(d);
    }
}
