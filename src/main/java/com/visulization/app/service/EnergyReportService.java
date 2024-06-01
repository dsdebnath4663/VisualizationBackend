package com.visulization.app.service;

import com.visulization.app.model.EnergyReport;

import java.util.List;

public interface EnergyReportService {
    List<EnergyReport> getAllEnergyReports();

    void saveEnergyReports(List<EnergyReport> energyReports);
}
