package com.visulization.app.service;

import com.visulization.app.model.EnergyReport;
import com.visulization.app.repository.EnergyReportRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyReportServiceImpl implements EnergyReportService{

    private final EnergyReportRepository energyReportRepository;


    public EnergyReportServiceImpl(EnergyReportRepository energyReportRepository) {
        this.energyReportRepository = energyReportRepository;
    }

    @Override
    public List<EnergyReport> getAllEnergyReports() {
        return energyReportRepository.findAll() ;
    }

    @Override
    @Transactional
    public void saveEnergyReports(List<EnergyReport> energyReports) {
        energyReportRepository.saveAll(energyReports);
    }


}
