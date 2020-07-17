package com.gmail.robertosrjr.organic.provider.domain.repository;

import com.gmail.robertosrjr.organic.provider.domain.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, String> {

    public Optional<Provider> findByUf(String uf);
}
