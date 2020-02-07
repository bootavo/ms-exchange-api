package com.exchange.api.repository;
import com.exchange.api.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {

    ExchangeRate findByLabel(String label);

}
