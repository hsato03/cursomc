package com.project.cursomc.resources;

import com.project.cursomc.entities.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> listar() {
        Categoria categoria1 = new Categoria(1, "Informática");
        Categoria categoria2 = new Categoria(2, "Escritório");

        return Arrays.asList(categoria1, categoria2);
    }

}
