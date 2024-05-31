package com.visulization.app.repository;

import com.visulization.app.model.EnergyReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyReportRepository extends JpaRepository<EnergyReport, Long> {
}
