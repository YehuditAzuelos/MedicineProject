import java.util.Locale;

public abstract class Medicine {
    //attributes:
    private String medicineName;

    private String companyName;
    private String companyEmail;
    private double price;
    private int quantity;
    private int expirationYear;
    private Type medType;


    enum Type{
        PILLS,
        SYRUP,
        INHALER
        }

    //constructor:
    public Medicine(String medicinename,String companyname,String companyemail, double price,
                    int quantity,int expirationyear,Type medtype) throws InvalidEmailAddressException {
        setMedicineName(medicinename);
        setCompanyName(companyname);
        setCompanyEmail(companyemail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationyear);
        setMedType(medtype);
    }

    //functions:

    //Print function:
    public String toString() {
        return "****************************"+"\n"+
                "name of medicine: "+getMedicineName()+"   name of company:  "
        +getCompanyName()+"   email of company:  "+getCompanyEmail()+
        "\nprice: "+getPrice()+"   quantity: "+getquantity()+"   expirationyear: "
        +getExpirationYear()+"   type of medicine: "+getMedType();}

    //An abstract function to calculate inventory for each medicine type:
    public abstract void totalInventory();

    //A function that returns TRUE if the quantity>0:
    public boolean inStock(Medicine m) {
        if (m.getquantity() > 0) {
            return true;
        }else return false;
    }

    //set:
    public void setMedicineName(String medicinename) {
        this.medicineName = medicinename.toUpperCase();
    }
    
    public void setCompanyName(String companyname) {
        this.companyName = companyname;
    }

    //Checking whether the @ character is present in the email address:
    public void setCompanyEmail(String companyEmail)throws InvalidEmailAddressException {
        String str = companyEmail;
        int indexstr = str.indexOf('@');
        if (indexstr < 0)
            throw new InvalidEmailAddressException(companyEmail, "The @ character must be added");

        //Checking whether the @ character is the first character in the email address:
        String str1 = companyEmail;
        int index = str1.indexOf('@');
        if (index == 0)

            throw new InvalidEmailAddressException(companyEmail, "The @ character cannot be the first character in the email address");

        //Checking whether the @ character is the last character in the email address:
        String str2 = companyEmail;

        boolean x1 = str2.endsWith("@");
        if (x1 == true)
            throw new InvalidEmailAddressException(companyEmail, "The @ character cannot be at the end of the email address");

        //Checking whether there is a dot after the @ character in the email address:
        String str3 = companyEmail;
        int index3 = str3.indexOf('@');
        int index4 = str3.indexOf('.');
        if (index3 > index4 || index4 < 0)
            throw new InvalidEmailAddressException(companyEmail, "Add a dot after the @ character");
        //Done in case the email address is correct:
        this.companyEmail = companyEmail;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setExpirationYear(int expirationyear) {
        this.expirationYear = expirationyear;
    }

    private void setMedType(Type medType) {this.medType = medType;}


    //get:
    public String getMedicineName() {
        return medicineName;

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public double getPrice() {
        return price;
    }
    public int getquantity() {return quantity;}

    public int getExpirationYear() {
        return expirationYear;
    }

    public Type getMedType() {return medType;}






}
