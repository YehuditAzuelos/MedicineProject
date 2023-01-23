public class MedicineDoesNotExistException extends Exception {

    public MedicineDoesNotExistException(String nameofmed) {
        super(nameofmed);
        System.out.println("The medicine you were looking for is not in stock");
    }

}


