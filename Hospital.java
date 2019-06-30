import java.util.ArrayList; //provides resizable-array and implements the List interface
import java.util.HashMap; //fast and easy to use class representing hash table, a data structure that associates keys with values.
import java.util.List;
import java.util.Map;

public class Hospital{
    static Map<Patient.Disease,Doctor.Speciality>specialityHandlingForDisease = new HashMap<Patient.Disease, Doctor.Speciality>();
    List<Doctor> doctors = new ArrayList<>();
    List<Patient>patients = new ArrayList<>();

    static{
        specialityHandlingForDisease.put(Patient.Disease.EYE, Doctor.Speciality.OPTHAMOLOGIST);
        specialityHandlingForDisease.put(Patient.Disease.HEART_PATIENT, Doctor.Speciality.SURGEON);
        specialityHandlingForDisease.put(Patient.Disease.EARNOSE, Doctor.Speciality.ENT);
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void showDoctors(){
        System.out.println("Doctors");
        for(int i =1; i < doctors.size();i++)
            System.out.println(i + ". " +  doctors.get(i).getName() + ": " + doctors.get(i).getSpecialty());
    }

    public void showPatients(){
        System.out.println("Patients");
        for(int i =1; i < patients.size();i++)
            System.out.println(i + ". " +"\nName    :"+ patients.get(i).getName()+"  \nAge     :"+ patients.get(i).getAge()+"  \nGender  :"+patients.get(i).getGender()+"\nDisease :"+patients.get(i).getDisease());


    }

    public void assignPatientToDoctor(int d, int p){
        doctors.get(d).addPatient(patients.get(p));
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
