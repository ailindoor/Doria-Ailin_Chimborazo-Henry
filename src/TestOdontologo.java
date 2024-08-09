import dao.BD;
import modelo.Odontologo;
import org.junit.jupiter.api.Test;
import servicio.OdontologoService;

import static org.junit.jupiter.api.Assertions.*;

class TestOdontologo {

    @Test
    public void casoUnoGuardar() {
        BD.createTable();
        //arrange -> dado lo que necesito para hacer la prueba
        Odontologo juan = new Odontologo(123,"Juan", "wer");
        Odontologo andre = new Odontologo(122,"andre", "iso");
        Odontologo camilo = new Odontologo(234,"camilo", "ksl");

        OdontologoService service = new OdontologoService();

        //act -> ocurre el proceso, la acción
        service.guardar(juan);
        service.guardar(andre);
        service.guardar(camilo);

        service.listarTodos();

        //assert -> comparo con lo que espero
        assertEquals(3,service.listarTodos().size());

    }

}