import java.sql.*;

public class ReadData {
	private static Connection conn = null;
	
	private static void connectToDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.164.60.79:1521:orcl","sys as sysdba","matrixcode");
		} catch(ClassNotFoundException cnf) {
			System.out.println("Failed to load Oracle Driver.");
			System.exit(1);
		} catch(SQLException se) {
			System.out.println(se);
		}
	}

	private static void disconnectFromDB() {
		try {
			conn.close();
		} catch(SQLException se) {
			System.out.println(se);
		}
	}

	private static void readData() {
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(3) + " " + rs.getString(1) + " " + rs.getString(2));
			}
		}catch(SQLException se) {
			System.out.println(se);
		}
	}

	public static void main(String args[]) throws Exception {
		connectToDB();
		readData();
		disconnectFromDB();
	}
}
