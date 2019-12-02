import java.sql.*;

public class InsertData2 {
	private static String userName;
	private static String password;
	private static String emailAddress;
	private static Connection conn = null;
	private static String hostName = "10.164.60.79";
	private static String dbName = "orcl";
	private static String dbPassword = "matrixcode";

	// Prints the usage syntax for this sample code.
	private static void usage() {
		System.out.println("Command usage :-");
		System.out.println("java InsertData2 <Username> <Password> <Email>");
		System.exit(1);
	}

	// Establish connection with Oracle Database
	private static void connectToDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@"+hostName+":1521:"+dbName,"sys as sysdba",dbPassword);
		} catch(ClassNotFoundException cnf) {
			System.out.println("Failed to load Oracle JDBC Driver."+cnf);
			System.exit(1);
		} catch(SQLException se) {
			System.out.println(se);
			System.exit(1);
		}
		System.out.println("Connected to Oracle Database");
	}

	// Disconnect connection to Oracle Database
	private static void disconnectFromDB() {
		try {
			conn.close();
			System.out.println("Connection to database closed.");
		} catch(SQLException se) {
			System.out.println(se);
			System.exit(1);
		}
	}

	// Insert a new Record to Database
	private static void insertRecord() {
		String sqlQuery = "insert into app_users values(?,?,?)";
		try {
			PreparedStatement pStm = conn.prepareStatement(sqlQuery);
			pStm.setString(1, userName);
			pStm.setString(2, password);
			pStm.setString(3, emailAddress);
			pStm.executeUpdate();
		}catch(SQLException se) {
			System.out.println(se);
			disconnectFromDB();
			System.exit(1);
		}
	}

	public static void main(String args[]) throws Exception {
		try{
			userName = args[0];
			password = args[1];
			emailAddress = args[2];
		} catch(ArrayIndexOutOfBoundsException aio) {
			usage();
		} catch(NumberFormatException nio) {
			System.out.println("Numeric Input required.");
			usage();
		}
		connectToDB();
		insertRecord();
		disconnectFromDB();
	}
}
