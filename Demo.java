import java.util.Scanner;//import scanner class

public class Demo {
public static void main (String args[]) {
    Hospital h1 = new Hospital();
    int choice;
//Doctors and their speciality
    Doctor o1 = new Doctor("James", "Opthalmologist");
    Doctor o2 = new Doctor("Steve", "ENT");
    Doctor o3 = new Doctor("David", "Surgeon");
    Doctor o4 = new Doctor("Matthew", "Gastroenterologists");
//to show doctors that we have
    h1.addDoctor(o1);
    h1.addDoctor(o2);
    h1.addDoctor(o3);
    h1.addDoctor(o4);
//to declare our patients and their disease
    h1.addPatient(new Patient("Bob", 15, "Male", "Stomach"));
    h1.addPatient(new Patient("Michael", 12, "Male", "heart patient"));
    h1.addPatient(new Patient("Michael ", 12, "Male", "heart patient"));
    h1.addPatient(new Patient("Sara ", 23, "Female", "ear nose"));
    h1.addPatient(new Patient("Amy ", 31, "Female", "ear nose"));
    h1.addPatient(new Patient("Rocky ", 18, "Male", "eye"));
    h1.addPatient(new Patient("Jessy ", 15, "Male", "heart patient"));

    while (true) {
        System.out.println("\n       ~~Welcome to Rachel's Hospital~~");
        System.out.println("||-----------------------------------------||");
        System.out.println("||Choose an option                         ||");
        System.out.println("||-----------------------------------------||");
        System.out.println("||Press 1 to add doctor                    ||");
        System.out.println("||Press 2 to show doctor.                  ||");
        System.out.println("||Press 3 to add patient                   ||");
        System.out.println("||Press 4 to show patient                  ||");
        System.out.println("||Press 5 to Assign doctor to patients     ||");
        System.out.println("||Press 6 to Show doctor and their patients||");
        System.out.println("||Press 7 for exit                         ||");
        System.out.println("||-----------------------------------------||");
        System.out.println("||-----------------------------------------||");
        Scanner cin = new Scanner(System.in);//tells the compiler to get the data typed in the Keyboard, Which is a input device
        choice = cin.nextInt();
        cin.nextLine();
        switch (choice) {
            // to add new doctor
            case 1: {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter Name: ");
                String name = s.nextLine();//this method returns the line that was skipped
                System.out.println("Enter Specialty: ");
                String specialty = s.nextLine();//
                h1.addDoctor(new Doctor(name, specialty));
                break;
            }
            //to show doctors
            case 2: {
                h1.showDoctors();
                break;
            }
            //to add new patient
            case 3: {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter Name: ");
                String name = s.nextLine();
                System.out.println("Enter Age: ");
                int age = s.nextInt();//Scans the next token of the input as an in
                s.nextLine();
                System.out.println("Enter Gender: ");
                String gender = s.nextLine();
                System.out.println("Enter Disease: ");
                String disease = s.nextLine();
                h1.addPatient(new Patient(name, age, gender, disease));
                break;
            }

            case 4: {
                h1.showPatients();
                break;
            }
            //to assign doctor to patients
            case 5: {
                Scanner s = new Scanner(System.in);
                System.out.println("Choose a doctor");
                h1.showDoctors();
                int doctorid = s.nextInt();
                s.nextLine();
                h1.showPatients();
                int patientid = s.nextInt();
                s.nextLine();
                h1.assignPatientToDoctor(doctorid, patientid);
                System.out.println("Assigned successfully.");
                break;
            }
            //to show doctors and their patients
            case 6: {
                System.out.println("Doctors with their respective patients");
                for (Doctor doctor : h1.getDoctors()) {
                    System.out.println(doctor.getName() + ": " + doctor.getSpecialty());
                    if (doctor.getPatients().size() > 0) {
                        for (Patient patient : doctor.getPatients()) {
                            System.out.println("    " + patient.getName() + ": " + patient.getDisease());
                        }
                    } else//if doctor don't have patient
                    {
                        System.out.println("    No patients");
                    }
                }
                break;
            }
            case 7:{
                System.out.println("Thank You");
            }

        }
    }
}}

