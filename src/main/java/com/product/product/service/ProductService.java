package com.product.product.service;

import com.product.product.request.ProductRequest;
import com.product.product.response.ProductResponse;

import java.util.List;

public interface ProductService  {



    ProductResponse createProdcut(ProductRequest productRequest );


        List< ProductResponse > getAllProduct();



}
