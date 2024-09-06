package com.dh.Doria_Ailin_Chimborazo_Henry.service;

import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Odontologo;

import java.util.List;

public interface IOdontologoServicio {
    Odontologo guardar (Odontologo odontologo);
    Odontologo buscarPorId(Long id);
    void eliminar(Long id);
    void actualizar (Odontologo odontologo);
    List<Odontologo> listarTodos();
}
