public class MedicineAlreadyExistException extends Exception{
    public MedicineAlreadyExistException(Medicine m) {
        super(m.getMedicineName());
        System.out.println("the medicine  "+m.getMedicineName()+" already in stock ");}
    }



