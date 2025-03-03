public class Student {
    // Making attributes
    private String name;
    private int age;
    private int ID;
    private String program;

    // Class Constructor
    public Student(String name, int age, String program) {
        this.name = name;
        this.age = age;
        this.ID = -1;
        this.program = program;
    }

    // Getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getID() {return ID;}
    public String getProgram() {return program;}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setID(int ID) {this.ID = ID;}
    public void setProgram(String program) {this.program = program;}

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name=" + name +
                ", age=" + age +
                ", program=" + program +
                "}";
    }
}
