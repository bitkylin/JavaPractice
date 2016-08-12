package logincontrol;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Msg {
    private int id;
    private String username;
    private String password;
    private String email = "";
    private String msg = "";

    private Msg(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private Msg(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    private Msg(String username, String password, String email, String msg) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.msg = msg;
    }

    private Msg(int id, String username, String password, String email, String msg) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.msg = msg;
    }

    public static Msg create(String... strs) throws IndexOutOfBoundsException {
        if (strs.length == 4)
            return new Msg(strs[0], strs[1], strs[2], strs[3]);
        else throw new IndexOutOfBoundsException("当前输入的String的个数为:" + strs.length + "不在范围内");
    }

    private static Msg create(int id, String... strs) throws IndexOutOfBoundsException {
        return new Msg(id, strs[0], strs[1], strs[2], strs[3]);
    }

    static Msg createFormResultSet(ResultSet resultSet) throws SQLException {
        return create(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
    }

    @Override
    public String toString() {
        return "Msg{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }

    String getEmail() {
        return email;
    }

    String getMsg() {
        return msg;
    }
}
