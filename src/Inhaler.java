public class Inhaler extends Medicine {
    //attribures:
    private int amountOfClick;

    //constructors:
    //public Inhaler(){};
    public Inhaler(String medicinename,String companyname,String companyemail, double price,int quantity,
                   int expirationyear,Type medtype,int amountOfClick)throws InvalidEmailAddressException{
        super(medicinename,companyname,companyemail,price,quantity,expirationyear,medtype);
        setAmountOfClick(amountOfClick);}
    //function:
    //Function to calculate inventory:
    @Override
    public void totalInventory() {
        System.out.println("All packages of the medicine "+getMedicineName()+" have: "+getquantity()*amountOfClick+" clicks");
    }
    //Print function:
    @Override
    public String toString() {
        return super.toString()+"   amountOfClick:"+getAmountOfClick()+"\n";
    }

    //set:
    public void setAmountOfClick(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }
    //get:
    public int getAmountOfClick() {
        return amountOfClick;
    }
}
