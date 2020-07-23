package com.gmail.robertosrjr.organic.provider.controller;

import com.gmail.robertosrjr.organic.provider.controller.dto.ItemDoPedidoDTO;
import com.gmail.robertosrjr.organic.provider.domain.model.Pedido;
import com.gmail.robertosrjr.organic.provider.domain.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
		return pedidoService.realizaPedido(produtos);
	}
	
	@RequestMapping("/{id}")
	public Pedido getPedidoPorId(@PathVariable Long id) {
		return pedidoService.getPedidoPorId(id);
	}
}
