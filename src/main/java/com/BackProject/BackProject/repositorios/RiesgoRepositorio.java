package com.BackProject.BackProject.repositorios;

import com.BackProject.BackProject.dominio.entidades.Riesgo;
import com.BackProject.BackProject.dominio.entidades.RiesgoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiesgoRepositorio extends JpaRepository<Riesgo, RiesgoId> {

}
