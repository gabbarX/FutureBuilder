import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static ArrayList<Student> studentArrayListt = new ArrayList<>();
    private static ArrayList<Company> companyArrayListt = new ArrayList<>();


    public static void app() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        placementCell cell = new placementCell();
        while (true) {
            System.out.println("You have successfully entered the Application");
//            System.out.println("\n");
            System.out.println("Choose the mode you want to enter in:-");
            System.out.println("1. Enter Student Mode");
            System.out.println("2. Enter as Company Mode");
            System.out.println("3. Enter as Placement Cell Mode");
            System.out.println("4. Return to Main Application");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Entering Student Mode");
                while (true){
                    System.out.println("Choose the Student Query to perform:");
                    System.out.println("1. Enter as a Student");
                    System.out.println("2. Add Students");
                    System.out.println("3. Back");
                    int choice2 = sc.nextInt();
                    if (choice2 == 1){
                        sc.nextLine();
                        System.out.println("Enter your name: ");
                        String lname = sc.nextLine();
                        System.out.println("Enter your roll number: ");
                        int lno = sc.nextInt();
                        for(int i=0;i<studentArrayListt.size();i++)
                        {
                            Student stemp=studentArrayListt.get(i);
                            if (stemp.getName().equals(lname) && stemp.getRollNo()==lno)
                            {
                                System.out.println("Welcome "+lname+"!!");
                                System.out.println("1. Register for Placement Drive.");
                                System.out.println("2. Register for Company.");
                                System.out.println("3. Get all Available companies.");
                                System.out.println("4. Get Current Status.");
                                System.out.println("5. Update CGPA.");
                                System.out.println("6. Accept offer.");
                                System.out.println("7. Reject offer.");
                                System.out.println("8. Back");
                                int choice3 = sc.nextInt();
                                if (choice3 == 1)
                                {   if(cell.getStudentRegistrationCT()!=null && cell.getStudentRegistrationOT()!=null) {
                                    if (LocalDateTime.now().isAfter(LocalDateTime.parse(cell.getStudentRegistrationCT(),format))
                                            && LocalDateTime.now().isBefore((LocalDateTime.parse(cell.getStudentRegistrationOT(),format)))) {
                                        cell.setStudentRegistrations(false);
                                    }
                                }
                                    else {

                                        if (cell.isStudentRegistrations()) {
                                            if (studentArrayListt.get(i).isRegistered) {
                                                System.out.println("You are already registered!");
                                            } else {
                                                studentArrayListt.get(i).isRegistered = true;
                                                System.out.println("You have successfully registered for the placemnet drive ^-^");
                                            }
                                        } else {
                                            System.out.println("Err. Cannot register since registrations have been closed by the placement cell.");
                                        }
                                    }
                                } else if (choice3==2) {
                                    if(studentArrayListt.get(i).isRegistered){
                                        sc.nextLine();
                                        System.out.println("Enter the name of the company to register:");
                                        String ctoregister = sc.nextLine();
                                        boolean flg = false;
                                        for(int j=0;j<studentArrayListt.get(i).regCompanies.size();j++){
                                            if (Objects.equals(studentArrayListt.get(i).regCompanies.get(j), ctoregister)) {
                                                flg = true;
                                                break;
                                            }
                                        }
                                        if(!flg) {
                                            int companyIndex = 0;
                                            for (int j = 0; j < companyArrayListt.size(); j++) {
                                                if (Objects.equals(companyArrayListt.get(j).getName(), ctoregister)) {
                                                    companyIndex = j;
                                                }
                                            }
                                            if ((companyArrayListt.get(companyIndex).getMincgpa() <= studentArrayListt.get(i).getCgpa()
                                                    && !studentArrayListt.get(i).isBlocked() && studentArrayListt.get(i).isRegistered()
                                                    && !studentArrayListt.get(i).isPlaced()) || companyArrayListt.get(companyIndex).getCtc()>= studentArrayListt.get(i).getCurrentPackage()) {
                                                studentArrayListt.get(i).regCompanies.add(ctoregister);
                                                companyArrayListt.get(companyIndex).regStudentRollnumber.add(studentArrayListt.get(i).getRollNo());
                                                System.out.println("You have successfully registered for " + ctoregister);
                                            }
                                            else {
                                                System.out.println("You are not eligible to register for this company");
                                            }
                                        }
                                        else {
                                            System.out.println("You are already registered for "+ctoregister);
                                        }
                                    }
                                    else {
                                        System.out.println("You are not registered for the placement drive.");
                                    }
                                } else if (choice3==3) {
                                    System.out.println("All available companies are:");
                                    for (Company company : companyArrayListt) {
                                        System.out.println((i + 1) + ". " + company.getName());
                                    }
                                } else if (choice3==4) {
                                    if(studentArrayListt.get(i).getOfferBy()!=null){
                                        System.out.println("You have been offered by "+studentArrayListt.get(i).offerBy+"!!. Please accept the offer.");
                                    } else if (studentArrayListt.get(i).isBlocked()) {
                                        System.out.println("You have been blocked by the placement cell.");
                                    }
                                    else {
                                        System.out.println("You have not been offered anything till now. Keep trying.");
                                    }

                                } else if (choice3==5) {
                                    System.out.println("Your current cgpa is "+studentArrayListt.get(i).getCgpa());
                                    System.out.println("Enter the updated cgpa: ");
                                    float updatedCgpa=sc.nextFloat();
                                    studentArrayListt.get(i).setCgpa(updatedCgpa);
                                    System.out.println("Cgpa for "+studentArrayListt.get(i).getName()+" has been udpated to "+studentArrayListt.get(i).getCgpa());
                                } else if (choice3==6) {
                                    if(studentArrayListt.get(i).getOfferBy()==null){
                                        System.out.println("You have no offers to accept.");
                                    }
                                    else {
                                        System.out.println("Congratulations "+studentArrayListt.get(i).getName()+"!! You accepted an offer from "+studentArrayListt.get(i).getOfferBy()+"!!");
                                    }

                                } else if (choice3==7) {
                                    if(studentArrayListt.get(i).getOfferBy()==null){
                                        System.out.println("You currently do not have any offers to reject.");
                                    }
                                    else {
                                        studentArrayListt.get(i).setOfferrejected();
                                        String otemp=studentArrayListt.get(i).getOfferBy();
                                        studentArrayListt.get(i).setOfferBy(null);
                                        studentArrayListt.get(i).setOfferOf(0);
                                        System.out.println("You have successfully rejected the offer from "+otemp+"!!");
                                    }

                                } else if (choice3==8) {
                                    break;
                                }
                                break;
                            }
                            else
                            {
                                System.out.println("Err. Student not found! Kindly Try Again.");
                            }
                        }
                    } else if (choice2==2) {
                        System.out.println("Number of students to add: ");
                        int addStudents = sc.nextInt();
                        for(int i=0;i<addStudents;i++){
                            sc.nextLine();
                            System.out.println("Enter the name of the student:");
                            String sname = sc.nextLine();
                            System.out.println("Enter the roll number of the student: ");
                            int sroll = sc.nextInt();
                            System.out.println("Enter the CGPA of the student: ");
                            float cgpa = sc.nextFloat();
                            System.out.println("Enter the branch of the student: ");
                            String branch = sc.next();
                            Student temp = new Student(sname, sroll,cgpa,branch);
                            studentArrayListt.add(temp);
                            System.out.println("Student Added Succesfully ^-^");
                        }
                    } else if (choice2==3)
                    {
                        break;
                    }
                }
            } else if (choice == 2) {
                System.out.println("Entering Company Mode");
                System.out.println("Choose the Company Query to perform:");
                System.out.println("1. Add company details");
                System.out.println("2. Choose Company");
                System.out.println("3. Get Available Companies");
                System.out.println("4. Back");
                int choice4 = sc.nextInt();
                if (choice4==1){
                    sc.nextLine();
                    System.out.println("Enter the name of the company: ");
                    String cname = sc.nextLine();
                    System.out.println("Enter the available role:");
                    String crole = sc.nextLine();
                    System.out.println("Enter the CTC (in LPA):");
                    int ctc = sc.nextInt();
                    System.out.println("Enter the minimum CGPA required:");
                    float rcgpa = sc.nextFloat();
                    Company temp = new Company(cname,crole,ctc,rcgpa);
                    companyArrayListt.add(temp);
                } else if (choice4==2) {
                    System.out.println("Choose to enter into mode of Available companies:");
                    for(int i=0;i<companyArrayListt.size();i++)
                    {
                        System.out.println((i+1)+" "+companyArrayListt.get(i).getName());
                    }
                    int targetcompany= sc.nextInt();
                    targetcompany--;
                    System.out.println("Welcome to "+companyArrayListt.get(targetcompany).name);
                    System.out.println("1. Update Role");
                    System.out.println("2. Update package");
                    System.out.println("3. Update CGPA criteria");
                    System.out.println("4. Register to Institute Drive");
                    System.out.println("5. Get Selected Students");
                    System.out.println("5. Back");
                    int cchoice= sc.nextInt();
                    if(cchoice==1){
                        System.out.println("Your current offered role is "+companyArrayListt.get(targetcompany).getRole());
                        sc.nextLine();
                        System.out.println("Enter the updated role:");
                        String updatedRole = sc.nextLine();
                        companyArrayListt.get(targetcompany).setRole(updatedRole);
                        System.out.println("Role has been updated successfully.");
                    } else if (cchoice==2) {
                        System.out.println("Your current package is "+companyArrayListt.get(targetcompany).getCtc());
                        System.out.println("Enter the new package: ");
                        float updatedPackage = sc.nextFloat();
                        companyArrayListt.get(targetcompany).setCtc(updatedPackage);
                        System.out.println("Your package has been successfully updated.");

                    } else if (cchoice==3) {
                        System.out.println("Your current minimum required CGPA is "+companyArrayListt.get(targetcompany).getMincgpa());
                        System.out.println("Enter the updated CGPA:");
                        float updatedCGPA = sc.nextFloat();
                        companyArrayListt.get(targetcompany).setMincgpa(updatedCGPA);
                    } else if (cchoice==4) {
                        if(cell.isCompanyRegistrations()) {
                            if (companyArrayListt.get(targetcompany).isRegisteredForDrive()) {
                                System.out.println("You are already registered!");
                            } else {
                                companyArrayListt.get(targetcompany).setRegisteredForDrive(true);
                                System.out.println("You are now successfully registered!");
                                companyArrayListt.get(targetcompany).setRegistrationTime(LocalDateTime.now().format(format));
                                System.out.println("Registration time: "+companyArrayListt.get(targetcompany).getRegistrationTime());
                            }
                        }
                        else {
                            System.out.println("Company registrations have been closed by placement cell.");
                        }
                    } else if (cchoice==5) {
                        System.out.println("Selected students for "+companyArrayListt.get(targetcompany)+" are:");
                        int stroll=companyArrayListt.get(targetcompany).selectStudent();
                        int targetStudent=0;
                        for(int j=0;j<studentArrayListt.size();j++){
                            if(studentArrayListt.get(j).getRollNo()==stroll){
                                targetStudent=j;
                                break;
                            }
                        }
                        companyArrayListt.get(targetcompany).setSelectedStudent(studentArrayListt.get(targetStudent).getName());
                        companyArrayListt.get(targetcompany).setSelectedStudentBranch(studentArrayListt.get(targetStudent).getBranch());
                        System.out.println("Name: "+studentArrayListt.get(targetStudent).getName());
                        System.out.println("Roll no:"+studentArrayListt.get(targetcompany).getRollNo());
                        System.out.println("Branch:"+studentArrayListt.get(targetcompany).getBranch());
                        studentArrayListt.get(targetStudent).gotOffer();
                        studentArrayListt.get(targetStudent).setOfferBy(companyArrayListt.get(targetcompany).getName());
                        studentArrayListt.get(targetStudent).setOfferOf(companyArrayListt.get(targetcompany).getCtc());
                    }
                } else if (choice4==3) {
                    System.out.println("Available companies are:");
                    for(int i=0;i<companyArrayListt.size();i++){
                        System.out.println((i+1)+" "+companyArrayListt.get(i).getName());
                    }
                } else if (choice4==4) {
                    break;
                }
            }
            else if(choice==3){
                System.out.println("Welcome to IIITD Placement Cell.");
                System.out.println("1. Open student registrations");
                System.out.println("2. Open company registrations");
                System.out.println("3. Get number of student registrations");
                System.out.println("4. Get number of company registrations");
                System.out.println("5. Get number of offered/un-offered/blocked students");
                System.out.println("6. Get student Details");
                System.out.println("7. Get company Details");
                System.out.println("8. Get average Package");
                System.out.println("9. Get company process results");
                System.out.println("10. Back");
                int pchoice = sc.nextInt();
                if(pchoice==1){
                    if (cell.isStudentRegistrations()){
                        System.out.println(" Student registrations are already Open");
                    }
                    else {
                        sc.nextLine();
                        System.out.println("Fill in the details:");
                        System.out.println("Set the opening time for the student registrations:");
                        System.out.println("format for the time is [dd-MM-yyyy HH:mm:ss]");
                        String openingTime = sc.nextLine();
                        cell.setStudentRegistrationOT(openingTime);
                        System.out.println("Set the closing time for the student registrations:");
                        System.out.println("format for the time is [dd-MM-yyyy HH:mm:ss]");
                        String closingTime = sc.nextLine();
                        cell.setStudentRegistrationCT(closingTime);
                    }
                    if(cell.getCompanyRegistrationCT()==null && cell.getCompanyRegistrationOT()==null)
                    {
                        System.out.println("Companies need to register first");
                    } else if (LocalDateTime.parse(cell.getCompanyRegistrationCT(), format).isBefore(LocalDateTime.parse(cell.getStudentRegistrationOT(), format ))){
                        cell.setStudentRegistrations(true);
                        System.out.println("Student registrations are now open.");
                    }
                    else {
                        System.out.println("Err...");
                        System.out.println("Registrations for students can’t open before company registrations end.");
                    }

                } else if (pchoice==2) {
                    if (cell.isCompanyRegistrations()){
                        System.out.println("Company registrations are already open.");
                    }
                    else {
                    System.out.println("Fill in the details:");
                    System.out.println("Set the opening time for the company registrations:");
                    sc.nextLine();
                    System.out.println("format for the time is [dd-MM-yyyy HH:mm:ss]");
                    String openingTime = sc.nextLine();
                    cell.setCompanyRegistrationOT(openingTime);
                    System.out.println("Set the closing time for the company registrations:");
                    System.out.println("format for the time is [dd-MM-yyyy HH:mm:ss]");
                    String closingTime = sc.nextLine();
                    cell.setCompanyRegistrationCT(closingTime);
                    }
                    cell.setCompanyRegistrations(true);
                    System.out.println("Company registrations are now open.");
                }
            }
            else if (choice == 4) {
                System.out.println("Returning to the Main Application..");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Future Builder!");
            System.out.println("1. Enter the Application");
            System.out.println("2. Exit the Application");
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 1) {
                app();
            } else if (n == 2) {
                System.out.println("Ok bye bye!");
                break;
            } else {
                System.out.println("Err. Enter a valid input!");
            }
        }

    }
}