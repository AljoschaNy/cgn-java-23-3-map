package de.neuefische;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pharmacy myPharmacy = new Pharmacy();

        myPharmacy.save(new Medication("test",9.99, true));
        myPharmacy.save(new Medication("test2",19.99, true));
        myPharmacy.save(new Medication("test3",29.99, true));

        //System.out.println(myPharmacy.find("test3"));

        myPharmacy.delete("test3");
        System.out.println(myPharmacy.getCount());

        System.out.println(myPharmacy);
    }
}