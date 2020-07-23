package com.gmail.robertosrjr.organic.provider.controller;

import com.gmail.robertosrjr.organic.provider.domain.model.Produto;
import com.gmail.robertosrjr.organic.provider.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/{uf}")
	public List<Produto> getProdutosPorEstado(@PathVariable("uf") String uf) {
		return produtoService.getProdutosPorEstado(uf);
	}
}
