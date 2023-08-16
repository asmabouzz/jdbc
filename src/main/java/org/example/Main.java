package org.example;

import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.example.exos.Exo1.menu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection=null;
        try {
            if(connection == null) {

                connection = DatabaseManager.getPostgreSQLConnection();
                menu();




            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {

            if (connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }

            }
        }


    }
}