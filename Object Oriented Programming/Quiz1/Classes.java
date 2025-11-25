public class Classes {
    private int classCode;
    private int sks;
    private String className;

    public Classes(int classCode, String className, int sks) {
        this.classCode = classCode;
        this.className = className;
        this.sks = sks;
    }

    public int getClassCode() {
        return classCode;
    }

    public String getClassName() {
        return className;
    }

    public int getSks() {
        return sks;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
