package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.dto.SaleReportDTO;
import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devsuperior.dsmeta.dto.SaleReportDTO(s.id, s.date, s.amount, seller.name) "
			+ "FROM Sale s "
			+ "JOIN s.seller seller "
			+ "WHERE s.date BETWEEN :minDate AND :maxDate "
			+ "AND UPPER(seller.name) LIKE UPPER(CONCAT('%', :sellerName, '%'))")
	Page<SaleReportDTO> searchSaleReport(LocalDate minDate, LocalDate maxDate, String sellerName, Pageable pageable);
}
