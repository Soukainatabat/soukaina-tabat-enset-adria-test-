package com.example.Customerservice.Repositories;

import com.example.Customerservice.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
