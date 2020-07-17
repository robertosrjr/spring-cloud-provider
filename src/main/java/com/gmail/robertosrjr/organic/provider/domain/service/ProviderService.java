package com.gmail.robertosrjr.organic.provider.domain.service;

import com.gmail.robertosrjr.organic.provider.domain.model.Provider;
import com.gmail.robertosrjr.organic.provider.domain.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;
    public Provider findByUf(String uf) throws Exception {

        Optional<Provider> prov = this.providerRepository.findByUf(uf);
        if (prov.isPresent()) {
            return prov.get();
        }
        throw new Exception("Fornecedor não encontrado.");
    }
}
