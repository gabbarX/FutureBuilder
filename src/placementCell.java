public class placementCell {
    private boolean studentRegistrations = false;
    private boolean companyRegistrations = false;
    private String companyRegistrationOT;
    private String companyRegistrationCT;
    private String studentRegistrationOT;
    private String studentRegistrationCT;
    public boolean isStudentRegistrations() {
        return studentRegistrations;
    }

    public String getCompanyRegistrationOT() {
        return companyRegistrationOT;
    }

    public void setCompanyRegistrationOT(String companyRegistrationOT) {
        this.companyRegistrationOT = companyRegistrationOT;
    }

    public String getCompanyRegistrationCT() {
        return companyRegistrationCT;
    }

    public void setCompanyRegistrationCT(String companyRegistrationCT) {
        this.companyRegistrationCT = companyRegistrationCT;
    }

    public String getStudentRegistrationOT() {
        return studentRegistrationOT;
    }

    public void setStudentRegistrationOT(String studentRegistrationOT) {
        this.studentRegistrationOT = studentRegistrationOT;
    }

    public String getStudentRegistrationCT() {
        return studentRegistrationCT;
    }

    public void setStudentRegistrationCT(String studentRegistrationCT) {
        this.studentRegistrationCT = studentRegistrationCT;
    }

    public void setStudentRegistrations(boolean studentRegistrations) {
        this.studentRegistrations = studentRegistrations;
    }

    public boolean isCompanyRegistrations() {
        return companyRegistrations;
    }

    public void setCompanyRegistrations(boolean companyRegistrations) {
        this.companyRegistrations = companyRegistrations;
    }
}
