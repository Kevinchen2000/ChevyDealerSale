
package logic;
import java.util.Random;

/**
 *
 * @author KevinChen
 */
public class Coupon {
    
    private final int [] cList2 ={ 67,40,36,73,11,	15,64,51,60,32};
    private final int [] cList5 = { 67,40,36,73,11,	15,64};
    private final int [] cList10 = {76,4,84,80,92                    };   
    private final int [] cList15 = {23,43,37                        };
    
    private int match;
    private int couponNum;
    
    public Coupon (int couponNum ){
        this.couponNum = couponNum;
    }

    /**
     * @return the couponNum
     */
    public int getCouponNum() {
        return couponNum;
    }

    /**
     * @param couponNum the couponNum to set
     */
    public void setCouponNum(int couponNum) {
        this.couponNum = couponNum;
    }

    /**
     * @return the match
     */
    public int getMatch() {
        
        for (int a = 0; a<cList2.length; a++)
        {
            int num1 = cList2[a];
            if (couponNum==num1 )
            {
                match = 2;
                break;
            }     
        }
        
        
        for (int a = 0; a<cList5.length; a++)
        {
            int num2 = cList5[a];
            if (couponNum==num2 )
            {
                match = 4;
                break;
            }     
        }
        
        
        for (int a = 0; a<cList10.length; a++)
        {
            int num3 = cList10[a];
            if (couponNum==num3 )
            {
                match = 10;
                break;
            }     
        }
        
        
        for (int a = 0; a<cList15.length; a++)
        {
            int num4 = cList15[a];
            if (couponNum==num4 )
            {
                match = 15;
                break;
            }     
        }
        
        
        
        
        
        
        
        
        
        return match;
    }
    
  
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
}
