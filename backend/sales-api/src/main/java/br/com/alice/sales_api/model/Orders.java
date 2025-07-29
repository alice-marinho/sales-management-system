package br.com.alice.sales_api.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ord_no")
    private Long id; // ORD_NO NUMERIC(5)

    @Column(name = "purch_amt", precision = 8, scale = 2)
    private BigDecimal purchAmt; // PURCH_AMT DECIMAL(8,2)

    @Column(name = "ord_date")
    private LocalDate ordDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer; // CUSTOMER_ID NUMERIC(5)

    @ManyToOne
    @JoinColumn(name = "salesman_id")
    private Salesman salesman;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPurchAmt() {
        return purchAmt;
    }

    public void setPurchAmt(BigDecimal purchAmt) {
        this.purchAmt = purchAmt;
    }

    public LocalDate getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(LocalDate ordDate) {
        this.ordDate = ordDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomerId(Customer customer) {
        this.customer = customer;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }
}