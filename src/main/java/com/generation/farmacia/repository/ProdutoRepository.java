package com.generation.farmacia.repository;

import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
