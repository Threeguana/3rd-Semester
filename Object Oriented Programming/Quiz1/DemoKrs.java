import java.util.ArrayList;

public class DemoKrs {

    public static void main(String[] args) {
        ArrayList<Classes> krs1 = new ArrayList<>();
        UniStudent mhs1 = new UniStudent("244107060140", "Andini Tribuana");

        Classes mk1 = new Classes(101, "PBO", 4);
        Classes mk2 = new Classes(102, "Basdat", 3);
        Classes mk3 = new Classes(201, "Jarkom", 3);

        krs1.add(mk1);
        krs1.add(mk2);
        krs1.add(mk3);
        tampilKrs(mhs1, krs1);
    }

    public static void tampilKrs(UniStudent mahasiswa, ArrayList<Classes> krs) {
        System.out.println("NIM           : " + mahasiswa.getNim());
        System.out.println("Nama UniStudent: " + mahasiswa.getName());

        for (Classes mk : krs) {
            System.out.println("kode mk: " + mk.getClassCode());
            System.out.println("nama mk: " + mk.getClassName());
            System.out.println("sks: " + mk.getSks());
        }
    }
}
