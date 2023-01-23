public class Syrup extends Medicine{
    //attributes:
    private int bottleContent;
    //constructors:
    //public Syrup(){};
    public Syrup(String medicinename,String companyname,String companyemail, double price,int quantity,
                 int expirationyear,Type medtype,int bottleContent)throws  InvalidEmailAddressException{
        super(medicinename,companyname,companyemail,price,quantity,expirationyear,medtype);
        setBottleContent(bottleContent);
    }
    //function:
    //Function to calculate inventory:
    public void totalInventory() {
        System.out.println("All packages of the medicine "+getMedicineName()+" have: "+getquantity()*getBottleContent()+" drops");
    }
    //Print function:
    @Override
    public String toString() {
        return super.toString()+"   bottleContent: "+getBottleContent()+"\n ";
    }

    //set:
    public void setBottleContent(int bottleContent) {
        this.bottleContent = bottleContent;
    }
    //get:
    public int getBottleContent() {
        return bottleContent;
    }


}
