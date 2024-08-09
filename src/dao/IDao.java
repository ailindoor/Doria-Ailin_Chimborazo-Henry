package dao;

import java.util.List;

public interface IDao <T>{
    //metodo guardar
    T guardar (T t);

    //Consultar o Listar los odontologos
    List<T> listarTodos();
}
