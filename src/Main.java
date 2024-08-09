import dao.BD;
import modelo.Odontologo;
import servicio.OdontologoService;

public class Main {
    public static void main(String[] args) {
        BD.createTable();

        Odontologo odontologo = new Odontologo(122, "Andres", "Arango");

        OdontologoService service = new OdontologoService();

        service.guardar(odontologo);


    }
}
