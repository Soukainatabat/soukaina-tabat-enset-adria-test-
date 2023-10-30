package com.example.Customerservice.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "clientt")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY )
    private List<Wallet> clients;
}
