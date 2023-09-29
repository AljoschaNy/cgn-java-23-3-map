package de.neuefische;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> medications;

    public Pharmacy() {
        this.medications = new HashMap<>();
    }

    public int getCount() {
        return medications.size();
    }
}
