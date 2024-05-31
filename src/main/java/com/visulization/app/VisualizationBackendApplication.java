package com.visulization.app;

import com.visulization.app.service.EnergyReportFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisualizationBackendApplication implements CommandLineRunner {

    @Autowired
    private EnergyReportFileService energyReportFileService;

    public static void main(String[] args) {
        SpringApplication.run(VisualizationBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        energyReportFileService.uploadEnergyReportsFromFile("D:/jsondata.json");

    }
}
