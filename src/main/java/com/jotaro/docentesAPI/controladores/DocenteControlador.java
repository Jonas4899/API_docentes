package com.jotaro.docentesAPI.controladores;

import com.jotaro.docentesAPI.persistencia.dtos.DocenteDTO;
import com.jotaro.docentesAPI.servicios.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docentes")
public class DocenteControlador {

    private final DocenteService docenteService;

    @Autowired
    public DocenteControlador(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @PostMapping
    public ResponseEntity<DocenteDTO> crearDocente(@RequestBody DocenteDTO docenteDTO) {
        DocenteDTO nuevoDocente = docenteService.crearDocente(docenteDTO);
        return ResponseEntity.ok(nuevoDocente);
    }
}
