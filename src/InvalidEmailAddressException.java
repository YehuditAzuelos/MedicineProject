public class InvalidEmailAddressException extends Exception{

    public InvalidEmailAddressException(String nameOfMail,String massege) {
        super(nameOfMail);
        System.out.println("error in "+nameOfMail+" email address: "+massege);
    }

}
