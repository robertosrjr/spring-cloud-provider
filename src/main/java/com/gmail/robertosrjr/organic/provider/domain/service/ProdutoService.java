package com.gmail.robertosrjr.organic.provider.domain.service;

import com.gmail.robertosrjr.organic.provider.domain.model.Produto;
import com.gmail.robertosrjr.organic.provider.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	
}
