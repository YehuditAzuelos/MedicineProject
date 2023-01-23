public class Pills extends Medicine{
    //attributes:
    private int numOfPillsInBox;

    //constructors:
    //public Pills(){};
    public Pills(String medicinename,String companyname,String companyemail,
                 double price,int quantity,int expirationyear,
                 Type medtype,int numOfPillsInBox)throws  InvalidEmailAddressException{
        super(medicinename,companyname,companyemail,price,quantity,expirationyear,medtype);
        setNumOfPillsInBox(numOfPillsInBox);
    }
    //functions:
    //Function to calculate inventory:
    @Override
    public void totalInventory() {
        System.out.println("All packages of the medicine "+getMedicineName()+" have: "+getquantity()*getNumOfPillsInBox()+" pills");
    }
    //Print function
    @Override
    public String toString() {
        return super.toString()+"   numOfPillsInBox: "+getNumOfPillsInBox()+"\n ";
    }

    //set:
    public void setNumOfPillsInBox(int numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }
    //get:
    public int getNumOfPillsInBox() {
        return numOfPillsInBox;
    }
}
