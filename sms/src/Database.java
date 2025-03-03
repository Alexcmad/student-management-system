import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static Connection connect() throws ClassNotFoundException, SQLException {
        try {
            var jdbcUrl = DatabaseConfig.getDatabaseURL();
            var user = DatabaseConfig.getDatabaseUser();
            var password = DatabaseConfig.getDatabasePassword();

            return DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    static {
        var sql = "CREATE TABLE IF NOT EXISTS students(" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "age INTEGER NOT NULL," +
                "program VARCHAR(255) NOT NULL" +
                ");";
        try (var conn = connect();
             var stmt = conn.createStatement()){
            stmt.executeUpdate(sql);
        } catch (SQLException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
    }


    public static int insertStudent(Student student){
        var sql = "INSERT INTO students(name, age, program) " +
                "VALUES(?,?,?)";

        try (var conn = connect();
            var psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            psmt.setString(1, student.getName());
            psmt.setInt(2, student.getAge());
            psmt.setString(3, student.getProgram());

            int insertedRow = psmt.executeUpdate();
            if (insertedRow > 0){
                var rs = psmt.getGeneratedKeys();
                if (rs.next()){
                    return rs.getInt(1);
                }
            }
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return -1;
    }

    public static Student getStudentByID(int id){
        Student student = null;
        var sql = "SELECT * FROM students WHERE id = ?";

        try(var conn = connect();
        var psmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            psmt.setInt(1, id);
            ResultSet rs = psmt.executeQuery();
            if(rs.next()){
                student = new Student(rs.getString("name"), rs.getInt("age"), rs.getString("program"));
                student.setID(rs.getInt("id"));
                return student;
            }
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return student;
    }

    public static List<Student> getAllStudents(){
        var students = new ArrayList<Student>();
        var sql = "SELECT * FROM students";
        try(var conn = connect();
        var stmt = conn.createStatement()){
         var rs = stmt.executeQuery(sql);
         while(rs.next()){
             Student student = new Student(
                     rs.getString("name"),
                     rs.getInt("age"),
                     rs.getString("program"));
             student.setID(rs.getInt("id"));
             students.add(student);
         }
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }
}
