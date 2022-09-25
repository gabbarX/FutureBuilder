import java.util.ArrayList;

public class Student {
    private ArrayList<String> regCompanies = new ArrayList<>();
    private String name;
    private int rollNo;
    private float cgpa;
    private String offerBy;
    private float offerOf=0;
    private int offerNumber=0;
    private String branch;
    private int offersrejected=0;
    private String placedIn;
    private float currentPackage=0;
    private boolean isBlocked = false;
    private boolean isPlaced=false;
    private boolean isOffered=false;
    private boolean isRegistered=false;
    public int getOfferNumber() {
        return offerNumber;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
    public void setPlacedIn(String placedIn) {
        this.placedIn = placedIn;
    }

    public void checkBlock(){
        if(this.isOffered && getOfferNumber()==getOffersrejected() && getOfferNumber()>0 && getOffersrejected()>0){
            this.isBlocked=true;
        }
    }
    public boolean isOffered() {
        return isOffered;
    }
    public float getOfferOf() {
        return offerOf;
    }
    public void setOfferNumber() {
        this.offerNumber = this.offerNumber+1;
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

    public int getRollNo() {
        return rollNo;
    }

    public String getBranch() {
        return branch;
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

    public boolean isBlocked() {
        return isBlocked;
    }
    public ArrayList<String> getRegCompanies() {
        return regCompanies;
    }

    public void setRegCompanies(String company) {
        this.regCompanies.add(company);
    }

    public void setOfferrejected() {
        this.offersrejected = this.offersrejected+1;
    }

    public int getOffersrejected() {
        return offersrejected;
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
        placementCell cell = new placementCell();
        this.cgpa=cell.updateCgpa(cgpa);
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
