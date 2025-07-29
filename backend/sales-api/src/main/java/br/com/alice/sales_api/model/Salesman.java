package br.com.alice.sales_api.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "salesman")
public class Salesman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesman_id")
    private Long id; // SALESMAN_ID NUMERIC(5)

    @Column(name = "name", length = 30)
    private String name; // NAME VARCHAR(30)

    @Column(name = "city", length = 15)
    private String city; // CITY VARCHAR(15)

    @Column(name = "commission", precision = 5, scale = 2)
    private BigDecimal commission; // COMMISSION DECIMAL(5,2)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }



}