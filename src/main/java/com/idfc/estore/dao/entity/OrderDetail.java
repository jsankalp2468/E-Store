package com.idfc.estore.dao.entity;

import org.hibernate.validator.constraints.Range;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ORDER")
public class OrderDetail {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Range(min = 1, max = 10)
    @NotNull
    @Column(name = "QUANTITY")
    private Short Quantity;

    @Column(name = "AMOUNT")
    @NotNull
    private Float amount;


}
