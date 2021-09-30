package chapterThree;

public class ThreePointTwelve {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double pricePerItem;
    private double amount;

    public ThreePointTwelve(String partNumber, String partDescription, int itemQuantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.pricePerItem = pricePerItem;
        
    }
    public String getPartNumber(){
        return partNumber;
    }
    public void setPartNumber(String itemPartNumber){
        partNumber = itemPartNumber;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public void setPartDescription(String itemPartDescription){
        partDescription = itemPartDescription;
        
    }
    public int getItemQuantity(){
        return itemQuantity;
    }
    public void setItemQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    public void setPricePerItem(double itemPrice){
        pricePerItem = itemPrice;
    }

    public void getInvoice() {
        
    }

    public void amount(double amount) {
        this.amount = itemQuantity * pricePerItem;
        System.out.println(amount);
        
    }

    public double getAmount() {
        return amount;
    }
}
