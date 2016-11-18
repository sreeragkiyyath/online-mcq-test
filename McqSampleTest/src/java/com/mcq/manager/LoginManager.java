package com.mcq.manager;

import com.mcq.bean.Bean;
import com.mcq.db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginManager {

    Connection connection = null;
    boolean flag = false;

    public boolean checkLogin(Bean bean) {
        try {
            connection = new DbConnection().getConnection();
            String query = "SELECT * FROM login_table WHERE username = ? AND password = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, bean.getUsername());
            ps.setString(2, bean.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
}
