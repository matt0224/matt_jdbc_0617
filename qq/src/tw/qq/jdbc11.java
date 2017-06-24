package tw.qq;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


//範例是介紹updata 換欄位 使用
public class jdbc11 {

	public static void main(String[] args) {
		// -------------------
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		try (Connection conn = 
			DriverManager.getConnection("jdbc:mysql://127.0.0.1/matt01", 
				prop)){
			Statement stmt = conn.createStatement();
			
			
			String sql = "SELECT FROM member id=2 ";
			
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			System.out.println(rs.getString(""));
			
			
			System.out.println("OK");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}