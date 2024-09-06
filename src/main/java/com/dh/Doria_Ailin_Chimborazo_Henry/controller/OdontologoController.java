package com.dh.Doria_Ailin_Chimborazo_Henry.controller;

import ch.qos.logback.core.model.Model;
import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Odontologo;
import com.dh.Doria_Ailin_Chimborazo_Henry.service.IOdontologoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private IOdontologoServicio odontologoServicio;

    @GetMapping("buscar/{id}")
    public ResponseEntity<Odontologo> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(odontologoServicio.buscarPorId(id));
    }
    @PostMapping
    public ResponseEntity<Odontologo> guardar(@RequestBody Odontologo odontologo) {
        return ResponseEntity.ok(odontologoServicio.guardar(odontologo));
        //return "redirect:/odontologos";
    }
    //listar todos
    @GetMapping
    public ResponseEntity<List<Odontologo>> listarTodos() {
        return ResponseEntity.ok(odontologoServicio.listarTodos());
    }
    @PutMapping("actualizar/{id}")
    public String actualizar(@PathVariable Long id, @RequestBody Odontologo odontologo){
        odontologo.setId(id);
        odontologoServicio.actualizar(odontologo);
        return "redirect:/odontologos";
    }
    @GetMapping("eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        odontologoServicio.eliminar(id);
        return "redirect:/odontologos";
    }
}
