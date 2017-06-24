package tw.qq;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

//json讀資料
public class jdbc06 {

	public static void main(String[] args) {
		// -------------------
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		try(Connection conn = 
			DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1/matt01",prop)){
			// 3. SQL statement
			String sql = "SELECT * FROM gift";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				String name = rs.getString("Name");
				System.out.println(name);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

