
package logic;

/*
 * @author KevinChen
 */
public interface Sale {

    
    public double getFeatures (); //All car has Features
    
    public double getCarPrice(); //
    public void setCarPrice(double carPrice);
    
    public double getTradeIn(); //
    
    public double getMSRP(); //
    public void setTradeIn (double tradeIn);
    
    public double getYouSave();
    
    public int getSaleCount();
    
    public double getTradeInTotal();
    
    public double getGrandTotal();
    
    
    public double getYouSaveTotal();
}
