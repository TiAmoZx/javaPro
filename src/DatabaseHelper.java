import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
    public static Connection con = null;
 static {
	 try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con = DriverManager.getConnection("jdbc:sqlserver://10.20.168.23:1433;DatabaseName=hosptial", "sa", "sa");
     } catch (ClassNotFoundException | SQLException e) {
         System.out.println("数据库初始化失败！");
         e.printStackTrace();
     }
 }
}
