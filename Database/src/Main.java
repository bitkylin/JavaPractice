import logincontrol.DBAccess;
import logincontrol.Msg;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sqlUrl = "jdbc:mysql://202.193.57.218:3306";
        String sqlUser = "123lml123";
        String sqlPassword = "";
        Main main = new Main();
        DBAccess access = new DBAccess(sqlUrl, sqlUser, sqlPassword);
        boolean loop = true;
        while (loop) {
            System.out.println("请数入您要进行的操作:");
            System.out.println("[1] 插入");
            System.out.println("[2] 查询");
            System.out.println("[3] 退出");
            switch (Integer.parseInt(main.scanner.nextLine())) {
                case 1:
                    access.add(main.add());
                    break;
                case 2:
                    access.getAll().forEach(main::handleMsg);
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
    }

    private Msg add() {
        String username;
        String password;
        String email;
        String msg;
        System.out.println("输入用户名:");
        username = scanner.nextLine();
        System.out.println("输入密码:");
        password = scanner.nextLine();
        System.out.println("输入邮箱:");
        email = scanner.nextLine();
        System.out.println("输入备注信息:");
        msg = scanner.nextLine();
        return Msg.create(username, password, email, msg);
    }

    private void handleMsg(Msg msg) {
        System.out.println(msg.toString());
    }
}
