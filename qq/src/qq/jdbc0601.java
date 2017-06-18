package qq;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.json.JSONStringer;
import org.json.JSONWriter;

//json讀資料
public class jdbc0601 {

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
			
			  JSONWriter jw =new JSONStringer().array();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				String name = rs.getString("Name");
				String Feature = rs.getString("Feature");
				String SalePlace = rs.getString("SalePlace");
				String ProduceOrg = rs.getString("ProduceOrg");
				String SpecAndPrice = rs.getString("SpecAndPrice");
				String gid = rs.getString("ID");
				System.out.println(name);
				
				
			    jw.object();
			    jw.key("gid").value(gid);
			    
			    jw.key("Feature").value(Feature);
			    jw.key("name").value(name);
			    
			    jw.endObject();
			}
			jw.endArray();   
		    System.out.println(jw.toString());
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

