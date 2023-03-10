package com.latrosoft.shopy.api.shopyapi.Controller;

import com.latrosoft.shopy.api.shopyapi.Model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@RestController
public class ProductController {
    List<Product> products = Arrays.asList(
            new Product("101","Redmi Note Pro Max","foo faaa","image.png",16000.00f,0.6f),
            new Product("102","Iphone 12","foo faaa","image1.png",60000.00f,0.6f),
            new Product("103","Iphone 13","foo faaa","image2.png",65000.00f,0.5f)
    );
    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return products;
    }
    @RequestMapping("/products/{id}")
    @ResponseBody
    public List<Product> getProductById(@PathVariable (value="id") String id){
        System.out.println("[PRODUCT ID ]"+id);
        return  products.stream().filter(product -> product.getId().equals(id)).toList();
    }
}
