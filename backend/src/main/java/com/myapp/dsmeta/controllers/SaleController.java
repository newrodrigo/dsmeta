package com.myapp.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dsmeta.dto.SaleDTO;
import com.myapp.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	
	@GetMapping
	public List<SaleDTO> findSales() {
		List<SaleDTO> result = saleService.findSales();
		return result;
	}
}
