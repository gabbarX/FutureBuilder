import java.util.ArrayList;

public class Student {
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
    boolean isRegistered=false;

    public int getOfferNumber() {
        return offerNumber;
    }


    public void checkBlock(){
        if(!this.isPlaced && offerNumber==offersrejected && offerNumber>0 && offersrejected>0){
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

    public boolean isPlaced() {
        return isPlaced;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public ArrayList<String> getRegCompanies() {
        return regCompanies;
    }

    public void setRegCompanies(ArrayList<String> regCompanies) {
        this.regCompanies = regCompanies;
    }

    public void setOfferrejected() {
        this.offersrejected = offersrejected+1;
    }

    public int getOffersrejected() {
        return offersrejected;
    }

    public ArrayList<String> regCompanies = new ArrayList<>();

    public void setPlacedIn(String placedIn) {
        this.placedIn = placedIn;
    }

    public float getCurrentPackage() {
        return currentPackage;
    }

    public void setPlaced(boolean placed) {
        isPlaced = placed;
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
