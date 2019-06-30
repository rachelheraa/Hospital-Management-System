public class Patient implements People{//for implementing an interface
    private String name;
    private String disease;
    private int age;
    private String gender;
//set name, age, gender, and disease to patient
    public Patient(String name,int age, String gender,String disease)
    //reference variable that refers to the current object.
    {
        this.name = name;
        this.disease = disease;
        this.age = age;
        this.gender = gender;
    }
    //An enum type is a special data type that enables for a variable to be a set of predefined constants
    public enum Disease{// a special "class" that represents a group of constants (unchangeable variables, like final variables).
        EYE, HEART_PATIENT, EARNOSE
    }
    public String getName() {
        return name;
    }

    String getDisease() {
        return disease;
    }
    public void setDisease(String disease) { this.disease = disease;
    }
    public int getAge(){ return age;}
    public String getGender(){ return gender;}
}
