package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws Exception {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
           Statement st=con.createStatement();
          int x= st.executeUpdate("insert into ap values(2,'ashok')");
          System.out.println(x);
           con.close();
	}

}
