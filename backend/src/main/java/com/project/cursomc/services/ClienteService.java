package com.project.cursomc.services;

import com.project.cursomc.entities.Cliente;
import com.project.cursomc.repositories.ClienteRepository;
import com.project.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    @Transactional(readOnly = true)
    public Cliente findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Id não encontrado: " + id));
    }
}
