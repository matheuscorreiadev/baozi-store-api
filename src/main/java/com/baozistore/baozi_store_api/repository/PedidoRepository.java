package com.baozistore.baozi_store_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.baozistore.baozi_store_api.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}