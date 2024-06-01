package com.visulization.app.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.visulization.app.model.EnergyReport;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class EnergyReportFileService {

    private EnergyReportServiceImpl energyReportService;

    public EnergyReportFileService(EnergyReportServiceImpl energyReportService) {
        this.energyReportService = energyReportService;
    }
    @Transactional
    public void uploadEnergyReportsFromFile(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<EnergyReport> energyReports = objectMapper.readValue(new File(filePath), new TypeReference<List<EnergyReport>>() {
        });
        energyReportService.saveEnergyReports(energyReports);
    }

}
