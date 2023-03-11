package com.latrosoft.shopy.api.shopyapi.Dao;


import com.latrosoft.shopy.api.shopyapi.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {

}
