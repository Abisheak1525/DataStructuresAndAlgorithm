import java.sql.*;

public class App {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/employee_management";
    static final String USER = "root";
    static final String PASS = "Abi@2004";

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            //Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //Open a connection
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            if (con != null) {
                System.out.println("Connected to Database!");
                
                con.setAutoCommit(false);
                //Create a statement
                st = con.createStatement();

                //create operation
                String createUserSQL = "INSERT INTO employee (id,name,email,department,salary) VALUES ('10004','Abisheak','10004@gmail.com','back-end','43000')";
                int rowsInserted = st.executeUpdate(createUserSQL);
                System.out.println(rowsInserted + " Row(s) inserted.");

                System.out.println("Before Upation");
                //read operation
                String readUserSQL = "SELECT * FROM employee WHERE name = 'Dhasarathan'";
                ResultSet rs = st.executeQuery(readUserSQL);
                while (rs.next()) {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String department=rs.getString("department");
                    String salary = rs.getString("salary");
                    System.out.println("Id : "+id+" Name : "+name+" Email : "+email+" Department : "+department+" Salary : "+salary);
                }
                rs.close();
                
                // update operation
                String updateUserSQL = "UPDATE employee SET email = '10002@gmail.com' WHERE id='10002'";
                int rowsUpdated = st.executeUpdate(updateUserSQL);
                System.out.println(rowsUpdated + " row(s) updated.");

                System.out.println("After Updation");
                //read operation
                String readUser = "SELECT * FROM employee WHERE id='10001'";
                ResultSet ru = st.executeQuery(readUser);
                while (ru.next()) {
                    int id = ru.getInt("id");
                    String name = ru.getString("name");
                    String email = ru.getString("email");
                    String department=ru.getString("department");
                    String salary = ru.getString("salary");
                    System.out.println("Id : "+id+" Name : "+name+" Email : "+email+" Department : "+department+" Salary : "+salary);
                }
                ru.close();

                //delete operation
                String DeleteUserSQL="DELETE from employee where name='Abisheak'";
                int rowsDeleted= st.executeUpdate(DeleteUserSQL);
                System.out.println(rowsDeleted+"row(s) deleted");


                // Commit transaction
                con.commit();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
