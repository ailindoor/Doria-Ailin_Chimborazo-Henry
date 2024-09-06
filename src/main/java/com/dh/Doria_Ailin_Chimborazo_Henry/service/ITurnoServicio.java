package com.dh.Doria_Ailin_Chimborazo_Henry.service;

import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Turno;

import java.util.List;

public interface ITurnoServicio {
    Turno guardar(Turno turno);
    Turno buscarPorId(Long id);
    void eliminar(Long id);
    List<Turno> listarTodos();
}
