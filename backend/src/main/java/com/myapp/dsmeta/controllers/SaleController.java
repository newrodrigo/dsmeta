package com.myapp.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dsmeta.dto.SaleDTO;
import com.myapp.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(
			@RequestParam(value="minDate", defaultValue = "") String minDate,
			@RequestParam(value="maxDate", defaultValue = "")String maxDate,
			Pageable pageable) {
		Page<SaleDTO> list = saleService.findSales(minDate, maxDate, pageable);
		return ResponseEntity.ok().body(list);
	}
}
