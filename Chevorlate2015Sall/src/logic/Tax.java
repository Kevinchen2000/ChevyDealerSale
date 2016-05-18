/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/*
 * @author KevinChen
 */
public interface Tax {
    
      double countryTax = 0.03;
      double cityTax = 0.04;
      double schoolTax = 0.01;
    
    public double getTax ();
    public double getTaxTotal();
  
    
}
