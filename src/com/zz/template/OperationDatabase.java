package com.zz.template;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author zz
 * @date 2019/11/30 19:11
 */
public abstract class OperationDatabase {

    Connection con;
    Statement sql;
    ResultSet rs;
    String dataBase, tableName;

    public final void lookResult() {
        loadDriver();
    }

    public abstract void loadDriver();

    public abstract void createConnection();

    public final void createStatement() {
        try {
            sql = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
