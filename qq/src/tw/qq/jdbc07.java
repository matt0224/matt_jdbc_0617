package tw.qq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

//08式密碼驗證
//07是新增資料
public class jdbc07 {

	public static void main(String[] args) {
		// -------------------連線先
				Properties prop = new Properties();
				prop.setProperty("user", "root");
				prop.setProperty("password", "root");
			try(Connection conn=
					DriverManager.getConnection("jdbc:mysql://127.0.0.1/matt01",prop)){	
				Statement stmt= conn.createStatement();
			
				
				//ResultSet rs = stmt.executeQuery("select count(*) from gift ");
				ResultSet rs = stmt.executeQuery(
						"select count(*) from member where account=? and passwd=?");
				rs.next();		 //如果上面是count(*)會先停在第一筆要用next
				System.out.println(rs.getString(1)); //列印比數
			}catch(Exception e){
				System.out.println(e);
			}

	}

}
