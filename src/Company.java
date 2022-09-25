import java.util.ArrayList;
import java.util.Random;

public class Company {
    private ArrayList<String> offeredStudentsList = new ArrayList<>();
    private ArrayList<String> results = new ArrayList<>();
    private ArrayList<Integer> regStudentRollnumber = new ArrayList<>();
    private String name;
    private String role;
    private float ctc;
    private float mincgpa;
    private String selectedStudent;
    private String selectedStudentBranch;
    private int selectedStudentRollNumber=0;
    private boolean registeredForDrive;
    private String registrationTime;

    public ArrayList<String> getResults() {
        return results;
    }
    public void setResults(String student) {

        this.results.add(student);
    }
    public ArrayList<String> getOfferedStudentsList() {
        return offeredStudentsList;
    }
    public void setOfferedStudentsList(String student) {
        this.offeredStudentsList.add(student);
    }
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
        this.offeredStudentsList.add(selectedStudent);
    }
    public void setSelectedStudentBranch(String selectedStudentBranch) {
        this.selectedStudentBranch = selectedStudentBranch;
    }
    public void setRegStudentRollnumber(int rollnumber) {
        this.regStudentRollnumber.add(rollnumber);
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
