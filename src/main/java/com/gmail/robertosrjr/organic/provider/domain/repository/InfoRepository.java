package com.gmail.robertosrjr.organic.provider.domain.repository;

import com.gmail.robertosrjr.organic.provider.domain.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado);
}
