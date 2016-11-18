package com.mcq.manager;

import com.mcq.bean.Bean;
import com.mcq.bean.McqBean;
import com.mcq.db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class McqManager {

    Connection connection = null;
    boolean flag = false;
    McqBean mcqbean;
    Statement stmt;
    ResultSet result;

    public McqManager() {

        connection = new DbConnection().getConnection();
        String query = "SELECT * FROM mcqset";
        try {
            System.out.println(connection);
            stmt = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(McqManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            result  = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(McqManager.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public McqBean getData() {
        mcqbean = new McqBean();
        try {
            if (result.next()) {
        //        System.out.println( "hello "+result.getString(1));
                mcqbean.setQuestion(result.getString("question"));
                mcqbean.setOption1(result.getString("option1"));
                mcqbean.setOption2(result.getString("option2"));
                mcqbean.setOption3(result.getString("option3"));
                mcqbean.setAnswer(result.getString("answer"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(McqManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mcqbean;
    }
}
