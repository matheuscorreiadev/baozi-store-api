package com.baozistore.baozi_store_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.baozistore.baozi_store_api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}