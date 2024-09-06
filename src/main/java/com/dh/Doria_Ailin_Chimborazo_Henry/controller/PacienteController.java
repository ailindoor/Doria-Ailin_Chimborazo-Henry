package com.dh.Doria_Ailin_Chimborazo_Henry.controller;

import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Odontologo;
import com.dh.Doria_Ailin_Chimborazo_Henry.entity.Paciente;
import com.dh.Doria_Ailin_Chimborazo_Henry.service.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteServicio iPacienteServicio;

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> consultarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(iPacienteServicio.buscarPorId(id));
        //return "redirect:/pacientes";
    }
    @PostMapping
    public ResponseEntity<Paciente> guardar(@RequestBody Paciente paciente) {
        return ResponseEntity.ok(iPacienteServicio.guardar(paciente));
    }
    @GetMapping
    public ResponseEntity<List<Paciente>> listarTodos() {
        return ResponseEntity.ok(iPacienteServicio.listarTodos());
    }
    @PutMapping("actualizar/{id}")
    public String actualizar(@PathVariable Long id, @RequestBody Paciente paciente){
        paciente.setId(id);
        iPacienteServicio.actualizar(paciente);
        return "redirect:/pacientes";
    }
    @GetMapping("eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        iPacienteServicio.eliminar(id);
        return "redirect:/pacientes";
    }
}
