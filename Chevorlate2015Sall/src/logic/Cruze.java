
package logic;

/*
 * @author KevinChen
 */
public class Cruze implements Sale,Tax,Discount {

    /**
     * @param aTaxTotal the taxTotal to set
     */
    
    // Instance Val 
    private double carPrice, tradeIn;
    private boolean blnTransmission, blnWheel, blnFog, blnSeat, blnSpeaker;
    private double discountAmt, featureCost, amtDue, youSave, tax;
    
    // Car Feature Constant Value
    private final double transmission = 1000;
    private final double wheel = 2500;
    private final double fog = 350;
    private final double seat = 2800;
    private final double speaker = 650;
    private final double msrp = 21500;
    
 
    
    //declare static variables 
    private static int sSaleCount;
    private static double sYouSaveTotal;
    private static double sTaxTotal;
    private static double sGrandTotal;
    private static double sTradeInTotal;
    
    // First non args defult Constructor
    
    public Cruze ()
    {
        carPrice = 0;
        tradeIn = 0;
   //     discountAmt = 0;
        youSave = 0;
        
        blnTransmission = false;
        blnWheel = false;  
        blnFog =false;  
        blnSeat = false;  
        blnSpeaker = false;
    }
    // Second args Constructor
    
    public Cruze (double carPrice, double tradeIn, boolean blnTransmission, 
             boolean blnWheel, boolean blnFog, boolean blnSeat, boolean blnSpeaker)
    {
        this.carPrice = carPrice;
        this.tradeIn = tradeIn;   
        
        this.blnTransmission = blnTransmission; 
        this.blnWheel = blnWheel;
        this.blnFog = blnFog;
        this.blnSeat = blnSeat;
        this.blnSpeaker = blnSpeaker;     
    }


    
    //Boolean Features------------------------------------------------------------------------------------------------------
    public boolean isBlnTransmission() {
        return blnTransmission;
    }

    public void setBlnTransmission(boolean blnTransmission) {
        this.blnTransmission = blnTransmission;
    }

    public boolean isBlnWheel() {
        return blnWheel;
    }

    public void setBlnWheel(boolean blnWheel) {
        this.blnWheel = blnWheel;
    }

    public boolean isBlnFog() {
        return blnFog;
    }

    public void setBlnFog(boolean blnFog) {
        this.blnFog = blnFog;
    }
    
    public boolean isBlnSeat() {
        return blnSeat;
    }


    public void setBlnSeat(boolean blnSeat) {
        this.blnSeat = blnSeat;
    }

    public boolean isBlnSpeaker() {
        return blnSpeaker;
    }

    public void setBlnSpeaker(boolean blnSpeaker) {
        this.blnSpeaker = blnSpeaker;
    }
//-End of Features Boolean----------------------------------------------------------------------------------------
    
    //Override Methods----------------------------------------
    @Override
    public double getCarPrice() {
        return carPrice;
    }
    @Override
    public void setCarPrice(double carPrice){
        this.carPrice = carPrice;
    }
    
    
        @Override
     public double getFeatures() // add Fetures price i
    {
        if (blnTransmission)
           featureCost+=getTransmission();
        if (blnWheel)
           featureCost+=getWheel();
        if (blnFog)
           featureCost+=getFog();
        if (blnSeat)
           featureCost+=getSeat();
        if (blnSpeaker) 
            featureCost+=getSpeaker();
            
        return featureCost;
    }
    
    @Override
    public double getTradeIn() { 
        return tradeIn;
    }
    @Override
    public void setTradeIn (double tradeIn){
        this.tradeIn = tradeIn;
    }
    
        @Override
    public double getMSRP() // MSRP Read Only
    {
        return msrp;
    }
    
    
       @Override
    public  double getTax() { //get Tax value after apply the discount 
        tax = (countryTax+cityTax+schoolTax) * (getSubTotal() - youSave);       
        return tax; 
    }
    
        @Override
     public double getYouSave() {
         youSave = discountAmt + (msrp-carPrice);
     return youSave;
}
    
     //End of Over Write Method--------------------------------------------------------------------------
     
     // Discount on Price ------------------------------------------------------------------------------------
    @Override
     public double getDiscount2 ()                          { //get the discount amount 
         discountAmt = discount2 * getSubTotal();          
         return discountAmt;                                   }
     
    @Override
        public double getDiscount5 ()                       {
         discountAmt = discount5 * getSubTotal();          
         return discountAmt;                                   }
     
    @Override
      public double getDiscount10 ()                        {
         discountAmt = discount10 * getSubTotal();          
         return discountAmt;                                   }
     
    @Override
      public double getDiscount15 ()                        {
         discountAmt = discount15 * getSubTotal();          
         return discountAmt;                                   }
    //End of Discount-------------------------------------------------------------------------------------------
    
      
      
      
      //    Get Static Save Value ------------------------------------------------------------------------------------
    
    @Override
        public double getYouSaveTotal() { // Get Static Save Value
        return sYouSaveTotal;
    }    

 

    @Override
    public double getGrandTotal() { // Get Static Save Value
        return sGrandTotal;
    }

    @Override
    public double getTradeInTotal() { // Get Static Save Value
        return sTradeInTotal;
    }
    
    public double getTaxTotal(){
        return sTaxTotal;
    }
    //  End of Get Static Save Value ------------------------------------------------------------------------------------
    

    
     public double getSubTotal ()  // SubTotal is the price without discount and tax it is non-static will be distroy
     {
         return ( carPrice + featureCost ) - tradeIn;
     }
    
     
     
     public double getAmtDue (){
         amtDue = (getSubTotal() + tax);
         
         sSaleCount++;          
         sGrandTotal += amtDue;     // Static value adds up !!!
         sTradeInTotal += tradeIn;      // Static value adds up !!!
         sYouSaveTotal += youSave;      // Static value adds up !!!
         sTaxTotal += tax;      // Static value adds up !!!
         
         return amtDue;
     }
     
     

    
    

    public double getTransmission() {
        return transmission;
    }


    public double getWheel() {
        return wheel;
    }


    public double getFog() {
        return fog;
    }

    public double getSeat() {
        return seat;
    }


    public double getSpeaker() {
        return speaker;
    }

    @Override
    public int getSaleCount() {
        return sSaleCount;
    }
    

    
    
}
