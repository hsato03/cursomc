package com.project.cursomc.resources;

import com.project.cursomc.entities.Pedido;
import com.project.cursomc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedidos")
public class PedidoResource {

    @Autowired
    PedidoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

}
