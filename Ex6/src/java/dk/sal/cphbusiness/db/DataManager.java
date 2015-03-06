/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sal.cphbusiness.db;

import dk.sal.cphbusiness.Display;
import dk.sal.cphbusiness.dto.PartDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sofus
 */
public class DataManager {

    public static ArrayList<PartDTO> getAllParts() throws ClassNotFoundException, SQLException {
        ArrayList<PartDTO> out = new ArrayList<>();

        ResultSet rs = null;
        Statement statement = null;
        Connection connection = null;

        try {
            //=== Load the JDBC-driver
            Class.forName(DB.driver);

            //=== Connect to the database
            connection = DriverManager.getConnection(DB.URL, DB.ID, DB.PW);

            //==== Instantiate a statement object 
            statement = connection.createStatement();

            //=== Build an SQL-query-statement
            String query = "SELECT * FROM parts";

            //=== Execute the query and receive the result
            rs = statement.executeQuery(query);

            //=== read the result
            while (rs.next()) {
                out.add(new PartDTO(rs.getInt("pno"), rs.getString("pname"), rs.getInt("qoh"), rs.getDouble("price"), rs.getInt("olevel")));

            }
        } //=== If database driver is unavailable or query fails
         //=== Always close the statement and connection
        finally {
                statement.close();
                connection.close();
            
        }

        return out;
    }
}
