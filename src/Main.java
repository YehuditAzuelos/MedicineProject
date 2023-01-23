import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Task 1:
        //Create an instance for the inventory:
        Inventory inventory1 = new Inventory();

        //Task 2:
        System.out.println("***task 2***"+"\n");
        //Creating instances for the Medicines:
        Pills p1=null;
           try {
            p1=new Pills("norupen", "teva", "teva@teva.com",
                    34.9, 20, 2023, Medicine.Type.PILLS, 82);
           } catch (InvalidEmailAddressException e) {
             e.printStackTrace();
             }catch (Exception e){}

        Pills p2=null;
            try {
             p2= new Pills("vita", "fol", "fol@fol.co.il",
                            45, 50, 2030, Medicine.Type.PILLS, 40);
            } catch (InvalidEmailAddressException e) {
               e.printStackTrace();
               }catch (Exception e){}

        Pills p3=null;
            try {
             p3 = new Pills("top", "moderna", "moderna@moderna.com",
                     45, 36, 2026, Medicine.Type.PILLS, 18);
            } catch (InvalidEmailAddressException e) {
               e.printStackTrace();
               }catch (Exception e){}

        Syrup s1=null;
            try {
             s1 = new Syrup("akamoli", "teva", "teva@teva.co.il",
                        39, 40, 2025, Medicine.Type.SYRUP, 50);
            } catch (InvalidEmailAddressException e) {
              e.printStackTrace();
              }catch (Exception e){}

        Syrup s2=null;
            try {
             s2 = new Syrup("tiptipot", "dd", "dd@dd.co.il",
                        59, 48, 2024, Medicine.Type.SYRUP, 50);
            } catch (InvalidEmailAddressException e) {
              e.printStackTrace();
              }catch (Exception e){}

        Syrup s3=null;
            try {
             s3 = new Syrup("siman", "sinana", "sinana@s.co.il",
                        49.9, 20, 2023, Medicine.Type.SYRUP, 29);
            } catch (InvalidEmailAddressException e) {
               e.printStackTrace();
               }catch (Exception e){}

        Inhaler i1=null;
            try {
             i1 = new Inhaler("ventolin", "tom", "tom@toma.co.il",
                        59, 40, 2031, Medicine.Type.INHALER, 38);
            } catch (InvalidEmailAddressException e) {
               e.printStackTrace();
               }catch (Exception e){}

        Inhaler i2=null;
            try {
             i2 = new Inhaler("eyes tipot", "eyes", "eyes@eyes.co.i",
                        64.9, 25, 2028, Medicine.Type.INHALER, 58);
            } catch (InvalidEmailAddressException e) {
               e.printStackTrace();
               }catch (Exception e){}

        Inhaler i3=null;
            try {
             i3 = new Inhaler("tippot", "tipa", "tipa@tipa.co.il",
                        50, 10, 2027, Medicine.Type.INHALER, 20);
           } catch (InvalidEmailAddressException e) {
              e.printStackTrace();
              }catch (Exception e){}

        //Continue task 2:
        //A call to the function that adds Medicines to the inventory:
        try {
            inventory1.addMedicine(p1);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(p2);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(p3);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(s1);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(s2);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(s3);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(i1);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(i2);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        try {
            inventory1.addMedicine(i3);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}


        //task 3:
        System.out.println("\n"+"***task 3***"+"\n");
        //Calling the function that performs a Medicine search by name:
        try {
            inventory1.searchMedicineByName("tiptipot");
        } catch (MedicineDoesNotExistException e) {
            e.printStackTrace();
        }catch (Exception e){}


        //task 4:
        System.out.println("\n" +"***task 4***"+"\n");
        //A call to the function that performs a search on all Medicines stocks according to the type of Medicine entered:
        inventory1.searchMedicineByType(i2);


        System.out.println("\n" +"***task 5***"+"\n");
        //task 5:
        //A call to the function that returns the details of the medicines that are in stock:
        inventory1.getMedicinesInStock();

        //task 6:
        System.out.println("\n" +"***task 6***"+"\n");
        //Calling the function that adds medicines to the inventory - I entered a Medicine that is already in the inventory:
        try {
            inventory1.addMedicine(p3);
        } catch (MedicineAlreadyExistException e) {
        }catch (Exception e){}

        //task 7:
        System.out.println("\n" + "***task 7***"+"\n");
        //Calling the function that performs a medicine search by name - I entered the name of a Medicine that is not in stock:
        try {
            inventory1.searchMedicineByName("vitamin c");
        } catch (MedicineDoesNotExistException e) {
            e.printStackTrace();
        }catch (Exception e){}


        //task 8:
        System.out.println("\n" + "***task 8***"+"\n");
        //Creating instances of medicines with invalid email addresses:
        //Entering an email address without the @ character:
        Syrup s4=null;
        try {
            s4 = new Syrup("syrup4", "ssy", "yss.co.il",
                    59, 48, 2024, Medicine.Type.SYRUP, 50);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }catch (Exception e){}
        //Entering an email address with the @ character as the first character:
        Pills p4=null;
        try {
            p4 = new Pills("toda", "moderna", "@dernamoderna.com",
                    45, 36, 2026, Medicine.Type.PILLS, 18);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }catch (Exception e){}
        //Entering an email address with the @ character as the last character:
        Inhaler i4=null;
        try {
            i4 = new Inhaler("morfyum", "tipa", "tipatipa.co.il@",
                    50, 10, 2027, Medicine.Type.INHALER, 20);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }catch (Exception e){}
        //Entering an email address without a dot or the @ character is placed after the dot:
        Inhaler i5=null;
        try {
            i5 = new Inhaler("ioon", "tipa", "tipa@tipacoil",
                    50, 10, 2027, Medicine.Type.INHALER, 20);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }catch (Exception e){}
        Syrup s5=null;
        try {
            s5 = new Syrup("syrup5", "ssy", "yss.co@l",
                    59, 48, 2024, Medicine.Type.SYRUP, 50);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }catch (Exception e){}

        //Adding a new medicine to the inventory with an invalid email address
        try {
            inventory1.addMedicine(new Pills("ddd","dd","rrkl",
                    34,50,2024, Medicine.Type.PILLS,30));
        } catch (MedicineAlreadyExistException e) {
        } catch (InvalidEmailAddressException e) {
        }catch (Exception e){}





    }

}











