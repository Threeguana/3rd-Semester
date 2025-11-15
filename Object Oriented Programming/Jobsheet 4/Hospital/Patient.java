package Hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String medicalRecordNumber;
    private String name;
    private List<Consultation> consultationHistory;

    public Patient(String medicalRecordNumber, String name) {
        this.medicalRecordNumber = medicalRecordNumber;
        this.name = name;
        this.consultationHistory = new ArrayList<>();
    }

    // Getters and Setters
    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add consultation record
    public void addConsultation(LocalDate date, Employee doctor, Employee nurse) {
        Consultation consultation = new Consultation();
        consultation.setDate(date);
        consultation.setDoctor(doctor);
        consultation.setNurse(nurse);
        consultationHistory.add(consultation);
    }

    // Get patient info including consultation history
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Medical Record No : ").append(medicalRecordNumber).append("\n");
        info.append("Name               : ").append(name).append("\n");

        if (!consultationHistory.isEmpty()) {
            info.append("Consultation History:\n");
            for (Consultation consultation : consultationHistory) {
                info.append(consultation.getInfo());
            }
        } else {
            info.append("No consultation history available.");
        }
        info.append("\n");

        return info.toString();
    }
}
