public class UniStudent {
    private String nim;
    private String name;
    private Classes classes;

    public UniStudent(String nim, String name) {
        this.nim = nim;
        this.name = name;
        this.classes = null;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Classes getClasses() {
        return this.classes;
    }

    public String getNim() {
        return this.nim;
    }

    public String setNim(String nim) {
        this.nim = nim;
        return nim;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return this.name;
    }
}
