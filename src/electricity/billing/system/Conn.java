package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Sonalijain1604@gmail.com");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}