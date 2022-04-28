import java.sql.*;

public class connect {
    private Connection con;
    private Statement sta;
    private ResultSet rs;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public Connection getConnection() {
        /****1433是你自己的SQLserver端口号(默认是1433)*********/
        /**************DatabaseName是你要连接的数据库名称*********/
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=student";
        try {
            /**第一个sa是你的SQLserver用户名,第二个是此用户名所对应的密码***/
            con = DriverManager.getConnection(url, "stu", "123456");
            sta = con.createStatement();
            System.out.println("连接成功");
        } catch (SQLException e) {
            System.out.println("连接失败");
            e.printStackTrace();
        }

        return con;
    }


}
