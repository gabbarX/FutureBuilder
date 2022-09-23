public class Company {
    String name;
    String role;
    float ctc;
    float mincgpa;

    public void setCtc(float ctc) {
        this.ctc = ctc;
    }

    boolean registeredForDrive;

    public String getName() {
        return name;
    }

    public void setMincgpa(float mincgpa) {
        this.mincgpa = mincgpa;
    }

    public float getMincgpa() {
        return mincgpa;
    }

    public float getCtc() {
        return ctc;
    }

    public void setRegisteredForDrive(boolean registeredForDrive) {
        this.registeredForDrive = registeredForDrive;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public boolean isRegisteredForDrive() {
        return registeredForDrive;
    }

    public Company(String name, String role, int ctc, float mincgpa) {
        this.name = name;
        this.role = role;
        this.ctc = ctc;
        this.mincgpa = mincgpa;
        this.registeredForDrive=false;
    }
}
