package br.com.alice.sales_api.repository;

import br.com.alice.sales_api.model.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
}
