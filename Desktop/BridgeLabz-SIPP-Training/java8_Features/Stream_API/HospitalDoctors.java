package Stream_API;

import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    public Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    @Override
    public String toString() {
        return name + " (" + specialty + ") - Weekend: " + (availableOnWeekend ? "Yes" : "No");
    }
}

public class HospitalDoctors {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Mehta", "Cardiologist", true),
            new Doctor("Dr. Sharma", "Neurologist", false),
            new Doctor("Dr. Iyer", "Orthopedic", true),
            new Doctor("Dr. Gupta", "Dermatologist", true),
            new Doctor("Dr. Khan", "Pediatrician", false),
            new Doctor("Dr. Singh", "Cardiologist", true)
        );

        System.out.println("=== Doctors Available on Weekends (Sorted by Specialty) ===");

        doctors.stream()
            .filter(doc -> doc.availableOnWeekend) // Only weekend doctors
            .sorted(Comparator.comparing(doc -> doc.specialty)) // Sort by specialty
            .forEach(System.out::println);
    }
}

