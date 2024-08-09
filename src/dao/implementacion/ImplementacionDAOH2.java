package dao.implementacion;

import dao.BD;
import dao.IDao;
import modelo.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionDAOH2 implements IDao<Odontologo> {
    private static final Logger LOGGER = Logger.getLogger(Odontologo.class);

    @Override
    public Odontologo guardar(Odontologo odontologo) {

        Connection connection = null;

        try {

            connection = BD.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO ODONTOLOGO ( NUMERO_MATRICULA, NOMBRE, APELLIDO)" +
                            "VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS
            );

            preparedStatement.setInt(1, odontologo.getNumeroDeMatricual());
            preparedStatement.setString(2,odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());

            preparedStatement.execute();

            ResultSet rs = preparedStatement.getGeneratedKeys();

            while (rs.next()){
                odontologo.setId((rs.getInt(1)));
                LOGGER.info("se creo el odontolog de nombre: "+ odontologo.getNombre());
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        Connection connection = null;

        List<Odontologo> odontologoList = new ArrayList<>();
        Odontologo odontologo = null;

        try {
            connection = BD.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM ODONTOLOGO"
            );

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                odontologo = new Odontologo(rs.getInt(1),
                        rs.getString(2),rs.getString(3));
                odontologoList.add(odontologo);

                LOGGER.info(odontologo.toString());
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

        return odontologoList;
    }
}
