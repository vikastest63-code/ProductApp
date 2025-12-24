package com.product.product.service;

import com.product.product.request.ProductRequest;
import com.product.product.response.ProductResponse;

public interface ProductService  {



    ProductResponse createProdcut(ProductRequest productRequest );
}
