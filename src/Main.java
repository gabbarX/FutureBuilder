import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> studentArrayListt = new ArrayList<>();
    private static ArrayList<Company> companyArrayListt = new ArrayList<>();
//    private static ArrayList<> studentArrayListt = new ArrayList<>();
    public static void app() {
        Scanner sc = new Scanner(System.in);
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

                        //studentarraylist.get(i)


                        for(int i=0;i<studentArrayListt.size();i++)
                        {
                            Student stemp=studentArrayListt.get(i);
                            if (stemp.name.equals(lname))
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
                                {
                                    if(studentArrayListt.get(i).isRegistered == true)
                                    {
                                        System.out.println("You are already registered!");
                                    }
                                    else
                                    {
                                        studentArrayListt.get(i).isRegistered = true;
                                        System.out.println("You have successfully registered for the placemnet drive ^-^");
                                    }

                                } else if (choice3==2) {
                                    //print company list
                                    System.out.println("Companys:");
                                } else if (choice3==3) {
                                    System.out.println("Yele bhai saari companies");
                                } else if (choice3==4) {
                                    //print student details
                                } else if (choice3==5) {
                                    //update cgpa
                                } else if (choice3==6) {
                                    //accept offer
                                } else if (choice3==7) {
                                    //reject offer
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
                        if(companyArrayListt.get(targetcompany).isRegisteredForDrive()){
                            System.out.println("You are already registered!");
                        }
                        else {
                            companyArrayListt.get(targetcompany).setRegisteredForDrive(true);
                            System.out.println("You are now successfully registered!");
                        }
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
                System.out.println("5. Get number of offered/unoffered/blocked students");
                System.out.println("6. Get student Details");
                System.out.println("7. Get company Details");
                System.out.println("8. Get average Package");
                System.out.println("9. Get company process results");
                System.out.println("10. Back");
                int pchoice = sc.nextInt();
                if(pchoice==1){

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