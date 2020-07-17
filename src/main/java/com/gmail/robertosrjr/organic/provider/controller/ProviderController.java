package com.gmail.robertosrjr.organic.provider.controller;

import com.gmail.robertosrjr.organic.provider.domain.model.Provider;
import com.gmail.robertosrjr.organic.provider.domain.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/{uf}")
    public ResponseEntity<?> findById(@PathVariable String uf) {

        try {
            Provider provider = this.providerService.findByUf(uf);
            return ResponseEntity.ok(provider);
        }catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
