package dao.implementacion;

import modelo.OdontologoArray;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class OdontologoDAOArray {
    private static final Logger LOGGER = Logger.getLogger(OdontologoDAOArray.class);

    //Almacenar odontologos
    private List<OdontologoArray> odontologos = new ArrayList<>();
    //Metodo para almacenar los odontologos
    public void guardarOdontologoArray(OdontologoArray odontologo){
        odontologos.add(odontologo);
        LOGGER.info("Odontólogo registrado: "+odontologo);
    }
    //Metodo para listar los odontologos
    public List<OdontologoArray> listarOdontologos(){
        LOGGER.info("Listado odontólogos");
        return new ArrayList<>(odontologos);
    }
}
