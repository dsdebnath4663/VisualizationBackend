package com.visulization.app.controller;

import com.visulization.app.model.EnergyReport;
import com.visulization.app.service.EnergyReportFileService;
import com.visulization.app.service.EnergyReportService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/energy-reports")
public class EnergyReportController {

    private final EnergyReportFileService energyReportFileService;

    private final EnergyReportService energyReportService;

    public EnergyReportController(EnergyReportFileService energyReportFileService, EnergyReportService energyReportService) {
        this.energyReportService = energyReportService;
        this.energyReportFileService = energyReportFileService;
    }

    @PostMapping("/upload")
    public String uploadEnergyReports(@RequestParam("file") String filePath) throws IOException {
        try {
            energyReportFileService.uploadEnergyReportsFromFile(filePath);
            return "File uploaded successfully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "File uploaded failed";

    }

    @GetMapping("/all")
    public List<EnergyReport> getAllEnergyReports() {
        return energyReportService.getAllEnergyReports();
    }


}
