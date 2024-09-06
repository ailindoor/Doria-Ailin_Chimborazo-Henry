package com.dh.Doria_Ailin_Chimborazo_Henry.service;

import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Paciente;

import java.util.List;

public interface IPacienteServicio {
    Paciente guardar (Paciente paciente);
    Paciente buscarPorId(Long id);
    List<Paciente> listarTodos();
    void actualizar(Paciente paciente);
    void eliminar(Long id);
}
