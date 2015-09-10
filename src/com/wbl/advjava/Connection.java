package com.wbl.advjava;

import java.net.ConnectException;

/**
 * Created by Sampath on 9/9/2015.
 */
public class Connection {

    public static final Connection conn = new Connection();

    private Connection() {

    }

    public static Connection getConnection() {
        return conn;
    }

}
