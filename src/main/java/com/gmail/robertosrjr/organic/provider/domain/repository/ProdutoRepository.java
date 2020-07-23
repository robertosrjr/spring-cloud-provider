package com.gmail.robertosrjr.organic.provider.domain.repository;

import com.gmail.robertosrjr.organic.provider.domain.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
