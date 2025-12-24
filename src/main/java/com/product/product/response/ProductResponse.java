package com.product.product.response;

import lombok.Getter;
import lombok.Setter;


import java.util.UUID;

@Setter
@Getter
public class ProductResponse {

    private UUID id;


    private  String name;


    private  String description;


    private  Long price;


    private   Long quantity;


}
