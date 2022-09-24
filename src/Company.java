import java.util.ArrayList;
import java.util.Random;

public class Company {
    private ArrayList<String> offeredStudentsList = new ArrayList<>();
    private ArrayList<String> results = new ArrayList<>();
    String name;
    String role;

    public void setResults(ArrayList<String> results) {
        this.results = results;
    }

    public ArrayList<String> getOfferedStudentsList() {
        return offeredStudentsList;
    }

    public void setOfferedStudentsList(ArrayList<String> offeredStudentsList) {
        this.offeredStudentsList = offeredStudentsList;
    }

    float ctc;
    float mincgpa;
    String selectedStudent;
    String selectedStudentBranch;
    int selectedStudentRollNumber=0;
    boolean registeredForDrive;
    String registrationTime;
    public ArrayList<Integer> regStudentRollnumber = new ArrayList<>();

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }
    public int selectStudent(){
        Random rand = new Random();
        int ridx = rand.nextInt(this.regStudentRollnumber.size());
        selectedStudentRollNumber = regStudentRollnumber.get(ridx);
        return selectedStudentRollNumber;
    }
    public String getRegistrationTime() {
        return registrationTime;
    }
    public void setSelectedStudent(String selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public void setSelectedStudentBranch(String selectedStudentBranch) {
        this.selectedStudentBranch = selectedStudentBranch;
    }

    public String getSelectedStudent() {
        return selectedStudent;
    }

    public String getSelectedStudentBranch() {
        return selectedStudentBranch;
    }

    public ArrayList<Integer> getRegStudentRollnumber() {
        return regStudentRollnumber;
    }

    public void setRegStudentRollnumber(ArrayList<Integer> regStudentRollnumber) {
        this.regStudentRollnumber = regStudentRollnumber;
    }

    public int getSelectedStudentRollNumber() {
        return selectedStudentRollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCtc(float ctc) {
        this.ctc = ctc;
    }


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
