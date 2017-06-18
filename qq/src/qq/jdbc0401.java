package qq;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;


	public class jdbc0401 {

		public static void main(String[] args) {
			try{
			// Establish the connection. 
				SQLServerDataSource ds = new SQLServerDataSource();
				ds.setIntegratedSecurity(false);
				ds.setServerName("localhost");
				ds.setPortNumber(1433); 
				ds.setUser("sa");
				ds.setPassword("sa");
				ds.setDatabaseName("Northwind");
				Connection conn = ds.getConnection();
				System.out.println("OK2");
			}catch(Exception e){
				System.out.println(e);
			}
			
			
		}
	}