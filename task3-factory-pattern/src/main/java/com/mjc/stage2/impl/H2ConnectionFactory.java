package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {
    @Override
    public Connection createConnection() {
     Connection con = null;
        Properties prop = new Properties();
        try {
        prop.load(getClass().getResourceAsStream("/h2database.properties"));
        return DriverManager.getConnection("jdbc:h2:~/test",prop);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // Write your code here!
}

