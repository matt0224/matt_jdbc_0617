package tw.qq;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Properties;

	public class jdbc04 {
		public static void main(String[] args) {
			// 1. Driver
			try{
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException ee){
				System.exit(-1);
			}
			
			try{
				Properties prop = new Properties();
				prop.setProperty("user", "root");
				prop.setProperty("password", "root");
				// 2. Connection
				Connection conn = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost/brad",
						prop);
				// 3. SQL statement
				Statement stmt = conn.createStatement();
				// 4. query
				String sql = "INSERT INTO cust (cname,tel,birthday)" + 
						" VALUES ('Amy','123','1999-09-08')";
				stmt.execute(sql);
				System.out.println(sql);
			}catch(SQLException se){
				System.out.println(se);
			}
			
			
			
		}
	}
