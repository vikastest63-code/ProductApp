package com.product.product.request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
public class ProductRequest {


    private UUID id;


    private  String name;


    private  String description;


    private  Long price;


    private   Long quantity;


    private LocalDate createdDate;
}
