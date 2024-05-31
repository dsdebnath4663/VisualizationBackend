package com.visulization.app.service;

import com.visulization.app.model.EnergyReport;
import com.visulization.app.repository.EnergyReportRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyReportService {

    private EnergyReportRepository energyReportRepository;


    public EnergyReportService(EnergyReportRepository energyReportRepository) {
        this.energyReportRepository = energyReportRepository;
    }

    @Transactional
    public void saveEnergyReports(List<EnergyReport> energyReports) {
        energyReportRepository.saveAll(energyReports);
    }


}
