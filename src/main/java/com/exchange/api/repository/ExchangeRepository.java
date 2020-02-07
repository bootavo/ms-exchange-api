package com.exchange.api.repository;
import com.exchange.api.model.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange, Integer> {

}
