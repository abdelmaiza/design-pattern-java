package dz.cirta.designspattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.EmbeddedDriver;

public class DbSingleton {

    private static volatile DbSingleton instance;
    private static volatile Connection connection;

    private DbSingleton() {

        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if(connection != null){
            throw new RuntimeException("Use getConnection() method to create");
        }

        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance(){
        //lazy loading
        if(instance == null){
            synchronized(DbSingleton.class){
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection(){
        if(connection == null){
            synchronized (Connection.class){
                if(connection == null){
                    String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                    try {
                        connection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
