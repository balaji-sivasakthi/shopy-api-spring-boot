package com.latrosoft.shopy.api.shopyapi.Controller;

import com.latrosoft.shopy.api.shopyapi.Dao.ProductRepository;
import com.latrosoft.shopy.api.shopyapi.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Stream;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;
//    List<Product> products = Arrays.asList(
//            new Product("101","Redmi Note Pro Max","foo faaa","image.png",16000.00f,0.6f),
//            new Product("102","Iphone 12","foo faaa","image1.png",60000.00f,0.6f),
//            new Product("103","Iphone 13","foo faaa","image2.png",65000.00f,0.5f)
//    );
    @RequestMapping("/product/add")
    @ResponseBody
    public String addProduct(Product product){
        productRepository.save(product);
        return "Product added with id"+product.getId();
    }
    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
