package com.prolimp.repository;

import com.prolimp.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
