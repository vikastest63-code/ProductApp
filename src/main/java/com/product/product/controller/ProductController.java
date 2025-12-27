package com.product.product.controller;

import com.product.product.request.ProductRequest;
import com.product.product.response.ProductResponse;
import com.product.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;



    @PostMapping("/save-product")
    public ResponseEntity<ProductResponse>createProduct(@RequestBody ProductRequest productRequest)
    {

      ProductResponse productResponse=  productService.createProdcut(productRequest);

      return ResponseEntity.ok().body(productResponse);
    }

}
