public class Student {
    public String name;
    public String studentID;
    public String major;
    public double GPA;

    public Student() {
        this.name = "";
        this.studentID = "";
        this.major = "";
        this.GPA = 0.0;
    }

    public Student(String name, String studentID, String major, double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.GPA = GPA;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Cholpon", "230142012", "Computer Science", 3.8);
        Student student3 = new Student("Cholponbek", "230143013", "Mathematics", 3.5);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
