package com.myapp.dsmeta.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<SaleDTO> findSales(String minDate, String maxDate,Pageable pageable) {
		
		if (minDate == null || minDate.isEmpty()) {
			LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);
			minDate = firstDayOfMonth.toString();
		}

		if (maxDate == null || maxDate.isEmpty()) {
			LocalDate lastDayOfMonth = LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth());
			maxDate = lastDayOfMonth.toString();
		}

		LocalDate min = LocalDate.parse(minDate);
		LocalDate max = LocalDate.parse(maxDate);

		Page<Sale> result = saleRepository.findSales(min, max, pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
