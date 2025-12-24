package com.product.product.service;

import com.product.product.mapper.ProductMapper;
import com.product.product.model.Product;
import com.product.product.repository.ProductRepository;
import com.product.product.request.ProductRequest;
import com.product.product.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl  implements  ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductResponse createProdcut(ProductRequest productRequest) {

      Product product=  productRepository.save(ProductMapper.toEntity(productRequest));

      return ProductMapper.toProductResponse(product);


    }
}
