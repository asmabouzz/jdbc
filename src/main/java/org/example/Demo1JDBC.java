package org.example;

import org.example.utils.DatabaseManager;

import java.sql.*;
import java.util.Scanner;

public class Demo1JDBC {
    public static void main(String[] args) throws SQLException {
        Scanner  scanner=new Scanner(System.in);
        Connection connection = null;


        try {
            if(connection == null) {

                connection = DatabaseManager.getPostgreSQLConnection();
               // System.out.println("merci de saisir le prenom");
                //String firstname = scanner.nextLine();
                //System.out.println("merci de saisir le nom");
                //String lastname = scanner.nextLine();
                // String request = "insert into personne(first_name,last_name)values('"+firstname+"','"+lastname+"')";
               // String request = "insert into personne(first_name,last_name)values(?,?)";


                //facon 1

             /*   Statement statement = connection.createStatement();
                boolean res = statement.execute(request);
                if (res){
                    System.out.println("des donnees renvoyer par la requette");
                }else {
                    System.out.println("aucun donnees envoyer par la requette");
                }

            }else{
                System.out.println("connexion echoué");
            }*/



            // facon 2 preparation de requette

              /*  PreparedStatement preparedStatement = connection.prepareStatement(request);
                preparedStatement.setString(1, firstname);
                preparedStatement.setString(2, lastname);
               // preparedStatement.execute();
                int nbRows = preparedStatement.executeUpdate();
                System.out.println("nombre de ligne " + nbRows);

              */

                //facon 3 avec recuperation de l'id auto generer

               /*
                 PreparedStatement preparedStatement=connection.prepareStatement(request,Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, firstname);
                preparedStatement.setString(2, lastname);
                int nbRows = preparedStatement.executeUpdate();
                ResultSet resultSet= preparedStatement.getGeneratedKeys();

               if(resultSet.next()){
                   System.out.println(resultSet.getInt(1));

               }*/

                //facon 4  avec requette de lecture (select)
                String request="select * from personne";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(request);
                while (resultSet.next()){
                    System.out.println(resultSet.getInt("id")+","+(resultSet.getString("first_name"))+","+(resultSet.getString("last_name")));
                }


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
