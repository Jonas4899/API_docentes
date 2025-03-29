package com.jotaro.docentesAPI.persistencia.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocenteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;
}
