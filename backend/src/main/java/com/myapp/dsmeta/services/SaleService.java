package com.myapp.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.dsmeta.dto.SaleDTO;
import com.myapp.dsmeta.entities.Sale;
import com.myapp.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Transactional(readOnly = true)
	public List<SaleDTO> findSales() {
		List<Sale> result = saleRepository.findAll();
		return result.stream().map(SaleDTO::new).toList();
	}
}
