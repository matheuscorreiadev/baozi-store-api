package com.baozistore.baozi_store_api.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.baozistore.baozi_store_api.model.Pedido;
import com.baozistore.baozi_store_api.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoRepository pedidoRepository;

    public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @GetMapping
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
        return pedidoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido criar(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Deletar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!pedidoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        pedidoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}