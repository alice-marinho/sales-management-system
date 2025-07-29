package br.com.alice.sales_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers") // Nome da tabela no banco
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id; // CUSTOMER_ID NUMERIC(5)

    @Column(name = "cust_name", length = 30)
    private String custName; // CUST_NAME VARCHAR(30)

    @Column(name = "city", length = 15)
    private String city; // CITY VARCHAR(15)

    @Column(name = "grade")
    private Integer grade; // GRADE NUMERIC(3)

    @ManyToOne
    @JoinColumn(name = "salesman_id")
    private Salesman salesman;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}