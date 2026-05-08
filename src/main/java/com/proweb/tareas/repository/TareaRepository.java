package com.proweb.tareas.repository;

import com.proweb.tareas.entity.Tarea;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByCompletada(boolean completada);
}
