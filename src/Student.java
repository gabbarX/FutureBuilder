import java.util.ArrayList;

public class Student {

    public ArrayList<String> regCompanies = new ArrayList<>();
    private ArrayList<String> appliedFor = new ArrayList<>();
    static float money=0;
    String name;
    int rollNo;
    float cgpa;
    String offerBy;
    float offerOf=0;
    int offerNumber=0;
    String branch;
    int offersrejected=0;
    String placedIn;
    float currentPackage=0;
    boolean isBlocked = false;

    boolean isPlaced=false;
    boolean isOffered=false;
    boolean isRegistered=false;

    public int getOfferNumber() {
        return offerNumber;
    }


    public ArrayList<String> getAppliedFor() {
        return appliedFor;
    }

    public void setAppliedFor(String company) {
        this.appliedFor.add(company);
    }

    public void checkBlock(){
        if(!this.isOffered && offerNumber==offersrejected && offerNumber>0 && offersrejected>0){
            this.isBlocked=true;
        }
    }

    public float getOfferOf() {
        return offerOf;
    }

    public void setOfferOf(float offerOf) {
        this.offerOf = offerOf;
    }

    public String getOfferBy() {
        return offerBy;
    }

    public void setOfferBy(String offerBy) {
        this.offerBy = offerBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPlacedIn() {
        return placedIn;
    }

    public void setOffered(boolean offered) {
        this.isOffered = offered;
    }

    public boolean isPlaced() {
        return isPlaced;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        this.isRegistered = registered;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        this.isBlocked = blocked;
    }

    public ArrayList<String> getRegCompanies() {
        return regCompanies;
    }

    public void setRegCompanies(ArrayList<String> regCompanies) {
        this.regCompanies = regCompanies;
    }

    public void setOfferrejected() {
        this.offersrejected = this.offersrejected+1;
    }

    public int getOffersrejected() {
        return offersrejected;
    }

    public void setPlacedIn(String placedIn) {
        this.placedIn = placedIn;
    }

    public float getCurrentPackage() {
        return currentPackage;
    }

    public void setPlaced(boolean placed) {
        this.isPlaced = placed;
    }

    public void setCurrentPackage(float currentPackage) {
        this.currentPackage = currentPackage;
    }

    public String getName() {
        return name;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void gotOffer() {
        this.offerNumber = this.offerNumber+1;
    }

    public float getCgpa() {
        return cgpa;
    }

    public Student(String name, int rollNo, float cgpa, String branch)
    {
        this.name = name;
        this.rollNo=rollNo;
        this.cgpa=cgpa;
        this.branch=branch;
    }


}
