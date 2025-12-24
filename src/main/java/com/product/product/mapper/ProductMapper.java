package com.product.product.mapper;

import com.product.product.model.Product;
import com.product.product.request.ProductRequest;
import com.product.product.response.ProductResponse;

public class ProductMapper {


    public static Product toEntity(ProductRequest productRequest)
    {
        Product product =new Product();
        product.setName(productRequest.getName());
        product.setQuantity(productRequest.getQuantity());
        product.setDescription(productRequest.getDescription());
        product.setCreatedDate(productRequest.getCreatedDate());
        return product;
    }



    public static ProductResponse toProductResponse(Product product)
    {

        ProductResponse  productResponse=new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setDescription(product.getDescription());
        productResponse.setPrice(product.getPrice());
        productResponse.setQuantity(product.getQuantity());
        return productResponse;
    }
}
