import dao.implementacion.OdontologoDAOArray;
import modelo.OdontologoArray;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoArrayTest {
    private OdontologoDAOArray odontologoDAOArray;

    public void iniciar(){
        odontologoDAOArray = new OdontologoDAOArray();
    }
    @Test
    public void casoUno(){
        //Iniciar caso
        this.iniciar();
        //Crear odontologos
        OdontologoArray odontologo1 =
                new OdontologoArray(1234,"Juan","Sanches");
        OdontologoArray odontologo2 =
                new OdontologoArray(5678,"Maria","Carrasco");
        OdontologoArray odontologo3 =
                new OdontologoArray(9101,"Liz","Perez");
        //Guardar odotologos
        odontologoDAOArray.guardarOdontologoArray(odontologo1);
        odontologoDAOArray.guardarOdontologoArray(odontologo2);
        odontologoDAOArray.guardarOdontologoArray(odontologo3);
        //Listar odontologos
        List<OdontologoArray> odontologoArrays = odontologoDAOArray.listarOdontologos();
        //assert -> comprobar el listado de los odontologos
        assertEquals(3,odontologoArrays.size());
        assertTrue(odontologoArrays.contains(odontologo1));
        assertTrue(odontologoArrays.contains(odontologo2));
        assertTrue(odontologoArrays.contains(odontologo3));
    }

}