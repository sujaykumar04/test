package practise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.*;

//import com.mysql.cj.Query;
//import com.mysql.cj.protocol.Resultset;

public class Database_Connectivity {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_Database", "root", "root");
		System.out.println("connection successful");
		Statement state = connect.createStatement();
		ResultSet result = state.executeQuery("select * from my_table");
		while ( result.next()){
			System.out.println(result.getInt(1) +"  " + result.getString(2));
		}

		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
