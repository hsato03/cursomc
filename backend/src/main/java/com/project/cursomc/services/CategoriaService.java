package com.project.cursomc.services;

import com.project.cursomc.entities.Categoria;
import com.project.cursomc.repositories.CategoriaRepository;
import com.project.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repository;

    @Transactional(readOnly = true)
    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! " +
                "Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
