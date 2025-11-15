package Hospital;

import java.time.LocalDate;

public class HospitalDemo {
    public static void main(String[] args) {
        Employee ani = new Employee("1234", "Dr. Ani");
        Employee bagus = new Employee("4567", "Dr. Bagus");

        Employee desi = new Employee("1234", "Nurse Desi");
        Employee eka = new Employee("4567", "Nurse Eka");

        Patient patient1 = new Patient("343298", "Puspa Widya");
        patient1.addConsultation(LocalDate.of(2021, 8, 11), ani, desi);
        patient1.addConsultation(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(patient1.getInfo());

        Patient patient2 = new Patient("997744", "Yenny Anggraeni");
        System.out.println(patient2.getInfo());
    }
}
