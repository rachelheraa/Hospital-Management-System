import java.util.ArrayList;//provides resizable-array and implements the List interface

public class Doctor implements People{
    private String name;
    private String specialty;
    private ArrayList<Patient> patiens = new ArrayList<>();
    private ArrayList<Doctor> doc = new ArrayList();
    public Doctor(String name, String specialty)
    {
        this.name = name;
        this.specialty = specialty;
    }
    public enum Speciality{// a special class that represents a group of constants (unchangeable variables, like final variables).
        OPTHAMOLOGIST, SURGEON, ENT
    }
    public ArrayList<Patient> getPatients()
    {
        return patiens;
    }

    public void addPatient(Patient patient)
    {
        patiens.add(patient);
    }

    public void showDoctors(){
        for(int i =0; i < patiens.size();i++)
            System.out.print(patiens.get(i).getName());
}
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}