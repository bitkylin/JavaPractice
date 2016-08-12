package logincontrol;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * MySQL操作类
 * <p>
 * 在"123lml123"数据库中，使用以下语句创建表：
 * USE 123lml123;
 * create table user(
 * id int NOT NULL  auto_increment primary key,
 * username char(20) NOT NULL,
 * password char(20) NOT NULL,
 * email char(40),
 * msg TEXT NOT NULL
 * );
 * <p>
 * 使用以下语句增加数据：
 * USE 123lml123;
 * INSERT INTO user (username,password,email,msg) VALUES('name1','password1','email1','信息1');
 * <p>
 * 使用以下语句查询数据：
 * SELECT * FROM user;
 */
public class DBAccess {
    private String sqlUrl;
    private String sqlUser;
    private String sqlPassword;


    public DBAccess(String sqlUrl, String sqlUser, String sqlPassword) {
        this.sqlUrl = sqlUrl;
        this.sqlUser = sqlUser;
        this.sqlPassword = sqlPassword;
    }

    public void add(Msg msg) throws IndexOutOfBoundsException {

        try (Connection connection = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword)) {
            String sql = String.format("INSERT INTO user (username,password,email,msg) VALUES('%s','%s','%s','%s');", msg.getUsername(), msg.getPassword(), msg.getEmail(), msg.getMsg());
            Statement statement = connection.createStatement();
            statement.execute("USE 123lml123;");
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Msg> getAll() {
        List<Msg> msgList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword)) {
            String sql = "SELECT * FROM user;";
            Statement statement = connection.createStatement();
            statement.execute("USE 123lml123;");
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                msgList.add(Msg.createFormResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return msgList;
    }
}

