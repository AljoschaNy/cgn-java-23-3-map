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

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        for(Medication medication : medications.values()) {
            if(medication.getName().equals(medicationName)) {
                return medication;
            }
        }
        return null;
    }

    public void delete(String medicationName) {
        for(Medication medication : medications.values()) {
            if(medication.getName().equals(medicationName)) {
                medications.remove(medication.getName());
                System.out.println("Medication has been deleted.");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medications=" + medications +
                '}';
    }
}
