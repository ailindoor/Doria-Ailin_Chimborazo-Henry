package com.dh.Doria_Ailin_Chimborazo_Henry.service.impl;

import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Odontologo;
import com.dh.Doria_Ailin_Chimborazo_Henry.repository.IOdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dh.Doria_Ailin_Chimborazo_Henry.service.IOdontologoServicio;
import java.util.List;
import java.util.Optional;
@Service
public class OdontologoServicioImpl implements IOdontologoServicio {
    @Autowired
    private IOdontologoRepository iOdontologoRepository;
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        return iOdontologoRepository.save(odontologo);
    }

    @Override
    public Odontologo buscarPorId(Long id) {
        Optional<Odontologo> odontologoBuscado = iOdontologoRepository.findById(id);
        if (odontologoBuscado.isPresent()) {
            return odontologoBuscado.get();
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long id) {
        iOdontologoRepository.deleteById(id);
    }

    @Override
    public void actualizar(Odontologo odontologo) {
        iOdontologoRepository.save(odontologo);
    }

    @Override
    public List<Odontologo> listarTodos() {
        return iOdontologoRepository.findAll();
    }

}
