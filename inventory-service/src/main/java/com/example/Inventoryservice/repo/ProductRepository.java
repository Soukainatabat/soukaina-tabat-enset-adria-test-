package com.example.Inventoryservice.repo;

import com.example.Inventoryservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository  extends JpaRepository<Product,Long> {
    
}
