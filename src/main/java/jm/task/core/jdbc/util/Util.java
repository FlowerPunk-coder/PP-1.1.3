package jm.task.core.jdbc.util;



import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Util {
    private final static String DB = "jdbc:mysql://localhost:3312/pp";
    private final static String LOGIN = "user";
    private final static String PASS = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB, LOGIN, PASS);
    }
}
