import java.sql.*;

public class InsertData {
	private static String firstName;
	private static String lastName;
	private static int rollNo;
	private static int eng;
	private static int hin;
	private static int math;
	private static int sci;
	private static int sst;
	private static Connection conn = null;
	private static String hostName = "10.164.60.79";
	private static String dbName = "orcl";
	private static String dbPassword = "matrixcode";

	// Prints the usage syntax for this sample code.
	private static void usage() {
		System.out.println("Command usage :-");
		System.out.println("java InsertData <First Name> <Last Name> <Roll No> <English> <Hindi> <Maths> <Science> <S. Studies>");
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
		String sqlQuery = "insert into student values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pStm = conn.prepareStatement(sqlQuery);
			pStm.setString(1, firstName);
			pStm.setString(2, lastName);
			pStm.setInt(3, rollNo);
			pStm.setInt(4, eng);
			pStm.setInt(5, hin);
			pStm.setInt(6, math);
			pStm.setInt(7, sci);
			pStm.setInt(8, sst);
			pStm.executeUpdate();
		}catch(SQLException se) {
			System.out.println(se);
			disconnectFromDB();
			System.exit(1);
		}
	}

	public static void main(String args[]) throws Exception {
		try{
			firstName = args[0];
			lastName = args[1];
			rollNo = Integer.parseInt(args[2]);
			eng = Integer.parseInt(args[3]);
			hin = Integer.parseInt(args[4]);
			math = Integer.parseInt(args[5]);
			sci = Integer.parseInt(args[6]);
			sst = Integer.parseInt(args[7]);
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
