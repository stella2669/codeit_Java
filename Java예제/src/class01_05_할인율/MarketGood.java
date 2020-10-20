package class01_05_할인율;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;
    
    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        if(discountRate < 0 || discountRate > 100){
            this.discountRate = 0;
        }else{
            this.discountRate = discountRate;
        }
    }
    public MarketGood(String name, int retailPrice){
        this(name, retailPrice, 0);
    }
    public String getName(){ 
        //name, retailPrice는 값 지정되어있기에 set필요 x
        return name;
    }
    public int getRetailPrice(){
        return retailPrice;
    }
    public int getDiscountRate(){
        return discountRate;
    }
    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    } // 할인율은 바뀔수 있기떄문에 get,set 생성
    
    public int getDiscountedPrice(){
        return retailPrice * (100 - discountRate)/100; 
    }
}