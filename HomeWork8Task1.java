package homeWork8;

public class HomeWork8Task1 {
    public static void main(String[] args) {
        Man man = new Man();
        String manName = man.setName("Mark");
        int manAge = man.setAge(20);
        int manWeight = man.setWeight(75);

        System.out.println("Name: " + manName);
        System.out.println("Age: " + manAge);
        System.out.println("Weight: " + manWeight);

        Student student = new Student();
        student.getEducationYears(2017);
    }
}

class Man {

    String name;
    int age;
    String gender;
    int weight;

    public String setName(String name) {
        this.name = name;
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

    public int setWeight(int weight) {
        this.weight = weight;
        return weight;
    }
}

class Student {
    int educationYears;

    public int getEducationYears(int startEducation) {
        int endEducation = startEducation + 5;
        System.out.println("Years of education: " + startEducation + "/" + endEducation);
        return educationYears;
    }
}
