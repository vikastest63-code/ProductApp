package com.product.product.controller;

import com.product.product.request.ProductRequest;
import com.product.product.response.ProductResponse;
import com.product.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;



    @PostMapping("/save")
    public ResponseEntity<ProductResponse>createProduct(@RequestBody ProductRequest productRequest)
    {

      ProductResponse productResponse=  productService.createProdcut(productRequest);

      return ResponseEntity.ok().body(productResponse);
    }

     @GetMapping("/getall-product")
    public ResponseEntity<List<ProductResponse>>getAllProducts()
    {
        List<ProductResponse>listOfProduct=  productService.getAllProduct();

        return ResponseEntity.ok().body(listOfProduct);
    }

}
