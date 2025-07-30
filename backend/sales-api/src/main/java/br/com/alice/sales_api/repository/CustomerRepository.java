package br.com.alice.sales_api.repository;

import br.com.alice.sales_api.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
