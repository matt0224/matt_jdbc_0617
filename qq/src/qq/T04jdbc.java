package qq;

	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Properties;

	public class T04jdbc {
		public static void main(String[] args) {
			// 1. Driver
//			try{
//				Class.forName("com.mysql.jdbc.Driver");
//			}catch(ClassNotFoundException ee){
//				System.exit(-1);
//			}
//			   java4可以省略
			try{
				Properties prop = new Properties();
				prop.setProperty("user", "root");
				prop.setProperty("password", "root");
				// 2. Connection
				Connection conn = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost/matt", //這邊是sql帳號
						prop);
				// 3. SQL statement
				Statement stmt = conn.createStatement();
				 //從connction取得Statement
				// 4. query
				String sql = "INSERT INTO cust (cname,tel,birthday)" + 
						" VALUES ('Amy','123','1999-09-08')";
				stmt.execute(sql);
				System.out.println(sql);
			}catch(SQLException se){
				System.out.println(se);
			}
			
			
			//------------ AutoCloseable 記得複製老師範例三
			
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			
			try(Connection conn = 
				DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1/matt01",prop)){  //這邊是sql帳號
				// 3. SQL statement
				String sql="insert into cust (cname,tel,birthday) values(?,?,?)";
				
				PreparedStatement pstmt=conn.prepareStatement(sql);
				
				pstmt.setString(1, "peter1");
				pstmt.setString(2, "321");
				pstmt.setString(3, "1989-01-14");
			    pstmt.execute();
			    
			    pstmt.setString(1, "peter2");
				pstmt.setString(2, "321");
				pstmt.setString(3, "1989-01-14");
			    pstmt.execute();
			    
			    pstmt.setString(1, "peter3");
				pstmt.setString(2, "321");
				pstmt.setString(3, "1989-01-14");
			    pstmt.execute();
			    //以上範例是防止影麻攻擊
				// 4. query
				

			}catch(Exception e){
				System.out.println(e);
			}
			
			
			
		}
	}