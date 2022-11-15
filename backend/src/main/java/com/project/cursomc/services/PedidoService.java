package com.project.cursomc.services;

import com.project.cursomc.entities.Pedido;
import com.project.cursomc.repositories.PedidoRepository;
import com.project.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoService {
    @Autowired
    PedidoRepository repository;

    @Transactional(readOnly = true)
    public Pedido findById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Id não encontrado" +
                + id));
    }

}
