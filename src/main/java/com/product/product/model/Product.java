package com.product.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Product")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  UUID id;

    @Column(name="name")
    private  String name;

    @Column(name="description")
    private  String description;

    @Column(name="price")
    private  Long price;

    @Column(name="quantity")
    private   Long quantity;

    @Column(name="createdDate")
    private LocalDate createdDate;
}
