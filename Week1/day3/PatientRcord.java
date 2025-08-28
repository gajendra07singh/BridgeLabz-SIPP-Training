import java.util.HashMap;
class Patient {
    int patientId;
    String name;
    int age;
    String disease;

   
    Patient(int patientId, String name, int age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

   
    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("-------------------------");
    }
}

class HospitalSystem {
    HashMap<Integer, Patient> patientRecords;

    HospitalSystem() {
        patientRecords = new HashMap<>();
    }

    void addPatient(Patient patient) {
        patientRecords.put(patient.patientId, patient);
        System.out.println("Patient added successfully.");
    }

    Patient getPatient(int patientId) {
        if (patientRecords.containsKey(patientId)) {
            return patientRecords.get(patientId);
        } else {
            System.out.println("Patient not found.");
            return null;
        }
    }

    void updatePatient(int patientId, Patient newPatient) {
        if (patientRecords.containsKey(patientId)) {
            patientRecords.put(patientId, newPatient);
            System.out.println("Patient updated successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    void deletePatient(int patientId) {
        if (patientRecords.containsKey(patientId)) {
            patientRecords.remove(patientId);
            System.out.println("Patient deleted successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }
    void displayAll() {
        if (patientRecords.isEmpty()) {
            System.out.println("No patient records available.");
        } else {
            for (Patient p : patientRecords.values()) {
                p.display();
            }
        }
    }
}
