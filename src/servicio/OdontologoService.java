package servicio;

import dao.IDao;
import dao.implementacion.ImplementacionDAOH2;
import modelo.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> interfazDAO;

    public OdontologoService(){
        this.interfazDAO = new ImplementacionDAOH2();
    }

    public Odontologo guardar(Odontologo odontologo){
        return interfazDAO.guardar(odontologo);
    }

    public List<Odontologo> listarTodos(){
        return interfazDAO.listarTodos();
    }

}
