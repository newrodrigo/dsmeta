package com.myapp.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
