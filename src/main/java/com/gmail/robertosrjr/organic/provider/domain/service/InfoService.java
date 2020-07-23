package com.gmail.robertosrjr.organic.provider.domain.service;

import com.gmail.robertosrjr.organic.provider.domain.model.InfoFornecedor;
import com.gmail.robertosrjr.organic.provider.domain.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}
}
