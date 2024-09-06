package com.dh.Doria_Ailin_Chimborazo_Henry.service.impl;

import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Paciente;
import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Turno;
import com.dh.Doria_Ailin_Chimborazo_Henry.repository.ITurnoRepository;
import com.dh.Doria_Ailin_Chimborazo_Henry.service.ITurnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
@Service
public class TurnoServicioImpl implements ITurnoServicio {
    @Autowired
    private ITurnoRepository iTurnoRepository;
    @Override
    public Turno guardar(Turno turno) {
        return iTurnoRepository.save(turno);
    }
    @Override
    public Turno buscarPorId(Long id) {
        Optional<Turno> turnoBuscado =  iTurnoRepository.findById(id);
        return turnoBuscado.orElse(null);
    }
    @Override
    public void eliminar(Long id) {
        iTurnoRepository.deleteById(id);
    }
    @Override
    public List<Turno> listarTodos() {
        return iTurnoRepository.findAll();
    }
}
