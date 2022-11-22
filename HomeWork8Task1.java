package homeWork8;

public class HomeWork8Task1 {
    public static void main(String[] args) {
        Student student = new Student("Mark", "male", 20, 75);
        student.setEducationYears(2022);
        student.addEducationYears();
    }
}

class Man {

    private String name;
    private int age;
    private String gender;
    private int weight;

    Man(String name, String gender, int age, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setGender(String gender) {
        this.gender = gender;
        return gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error. Incorrect age.");
        }
        return age;
    }

    public int getAge() {
        return age;
    }

    public int setWeight(int weight) {
        this.weight = weight;
        return weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Student extends Man {
    int educationYears;

    Student(String name, String gender, int age, int weight) {
        super(name, gender, age, weight);
    }

    public void setEducationYears(int educationYears) {
        this.educationYears = educationYears;
    }

    public int getEducationYears() {
        return educationYears;
    }

    public void addEducationYears() {
        this.educationYears++;
        System.out.println("Next education year: " + educationYears);
    }

}
