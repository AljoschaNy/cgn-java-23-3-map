package de.neuefische;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pharmacy myPharmacy = new Pharmacy();

        System.out.println(myPharmacy.getCount());

        myPharmacy.save(new Medication("test",9.99, true));

        System.out.println(myPharmacy.getCount());
    }
}