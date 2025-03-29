package com.jotaro.docentesAPI.servicios;

import com.jotaro.docentesAPI.persistencia.dtos.DocenteDTO;
import com.jotaro.docentesAPI.persistencia.entidades.DocenteEntity;
import com.jotaro.docentesAPI.persistencia.repositorios.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteService {

    private final DocenteRepository docenteRepositorio;

    @Autowired
    public DocenteService(DocenteRepository docenteRepositorio) {
        this.docenteRepositorio = docenteRepositorio;
    }

    public DocenteDTO crearDocente(DocenteDTO docenteDTO) {
        DocenteEntity docente = DocenteEntity.builder()
                .nombre(docenteDTO.getNombre())
                .apellido(docenteDTO.getApellido())
                .cedula(docenteDTO.getCedula())
                .direccion(docenteDTO.getDireccion())
                .telefono(docenteDTO.getTelefono())
                .fechaNacimiento(docenteDTO.getFechaNacimiento())
                .build();

        DocenteEntity docenteGuardado = docenteRepositorio.save(docente);

        return DocenteDTO.builder()
                .id(docenteGuardado.getId())
                .nombre(docenteGuardado.getNombre())
                .apellido(docenteGuardado.getApellido())
                .cedula(docenteGuardado.getCedula())
                .direccion(docenteGuardado.getDireccion())
                .telefono(docenteGuardado.getTelefono())
                .fechaNacimiento(docenteGuardado.getFechaNacimiento())
                .build();
    }
}
