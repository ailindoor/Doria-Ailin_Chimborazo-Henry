package dao;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:./POO", "sa", "sa");
    }

    public static void createTable(){
        Connection connection = null;

        try {
            connection = getConnection();
            String scriptSQL = new String(Files.readAllBytes(Paths.get("/home/ailin/Documentos/POO/Doria-Ailin_Chimborazo-Henry/src/script.sql")));

            Statement statement = connection.createStatement();
            statement.execute(scriptSQL);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }


}
