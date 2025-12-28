package com.product.product.service;

import com.product.product.exception.ProductNotFoundException;
import com.product.product.mapper.ProductMapper;
import com.product.product.model.Product;
import com.product.product.repository.ProductRepository;
import com.product.product.request.ProductRequest;
import com.product.product.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl  implements  ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductResponse createProdcut(ProductRequest productRequest) {

      Product product=  productRepository.save(ProductMapper.toEntity(productRequest));

      return ProductMapper.toProductResponse(product);


    }

    @Override
    public List<ProductResponse> getAllProduct() {

     List<Product> product=  productRepository.findAll();

     if(product.isEmpty())
     {
         throw new  ProductNotFoundException("Product list is empty");
     }

     return product.stream().map(ProductMapper::toProductResponse).
             collect(Collectors.
             toList());


    }

    @Override
    public List<ProductResponse> productByName(String name) {

     List<Product>products=  productRepository.findByName(name);

    return  products.stream().map(ProductMapper::toProductResponse).
             collect(Collectors.toList());
    }
}
