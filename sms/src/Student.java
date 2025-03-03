public class Student {
    // Making attributes
    private String name;
    private int age;
    private int ID;
    private String program;

    // Class Constructor
    public Student(String name, int age, int ID, String program) {
        this.name = name;
        this.age = age;
        this.ID = ID;
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

}
