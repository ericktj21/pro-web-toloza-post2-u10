package com.proweb.tareas.controller;

import com.proweb.tareas.entity.Tarea;
import com.proweb.tareas.service.TareaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
    private final TareaService service;

    public TareaController(TareaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crear(@Valid @RequestBody Tarea tarea) {
        return service.crear(tarea);
    }

    @GetMapping("/{id}")
    public Tarea buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PatchMapping("/{id}/completar")
    public Tarea completar(@PathVariable Long id) {
        return service.completar(id);
    }
}
