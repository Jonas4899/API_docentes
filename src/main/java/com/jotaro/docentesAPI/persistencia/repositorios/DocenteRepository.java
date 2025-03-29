package com.jotaro.docentesAPI.persistencia.repositorios;

import com.jotaro.docentesAPI.persistencia.entidades.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {
}
