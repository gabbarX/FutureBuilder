import java.util.ArrayList;
import java.util.Scanner;

public class

public class Main {
    private static ArrayList<Student> studentArrayListt = new ArrayList<>();
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
//                        boolean studentFound = true;
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
                int choice3 = sc.nextInt();
                //Company class
            }
            else if(choice==3){
                System.out.println("Entering Placement Cell Mode");
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