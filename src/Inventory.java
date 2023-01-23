import java.util.ArrayList;

public class Inventory {

    ArrayList<Medicine> medicineInventory = new ArrayList<>();

    //A function that receives a medicine and adds it to the inventory:
    public Medicine addMedicine(Medicine m) throws MedicineAlreadyExistException {
        Medicine n = null;
        for (Medicine m2 : medicineInventory) {
            if (m2.getMedicineName().equalsIgnoreCase(m.getMedicineName())) {
                n = m2;
                throw new MedicineAlreadyExistException(m);
            }
        }
        if (n == null) {
            medicineInventory.add(m);
            System.out.println("The medicine " + m.getMedicineName().toUpperCase() + " has been successfully added to the medicines inventory");
        }
        return n;
    }

    //A function that receives the name of a medicine and returns if there are medicines in stock with that name:
     public Medicine searchMedicineByName(String nameofmed) throws MedicineDoesNotExistException {
        Medicine resname = null;
        for (Medicine m1 : medicineInventory) {
            if (m1.getMedicineName().equalsIgnoreCase(nameofmed)) {
                System.out.println("The medicine " + m1.getMedicineName()+ " is in stock");
                resname=m1;
                m1.totalInventory();
            }
        }
        if (resname==null)
             throw new MedicineDoesNotExistException(nameofmed);
        return resname;
    }

        //A function that receives a medicine and returns all the medicines in the inventory according to the type of medicine entered:
        public void searchMedicineByType (Medicine m){
            for (Medicine m1 : medicineInventory) {
                if (m1.getMedType().equals(m.getMedType())) {
                    System.out.println(m1);
                }
            }
        }

        //A function that returns all the medicines that are in stock:
        public void getMedicinesInStock () {
            for (Medicine i : medicineInventory) {
                System.out.println(i.toString());
            }
        }


    }


