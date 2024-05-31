package com.visulization.app.controller;

import com.visulization.app.service.EnergyReportFileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/file")
public class EnergyReportController {

    private final EnergyReportFileService energyReportFileService;

    public EnergyReportController(EnergyReportFileService energyReportFileService) {
        this.energyReportFileService = energyReportFileService;
    }

    @PostMapping("/upload")
    public String uploadEnergyReports(@RequestParam("file") String filePath) throws IOException {
      try {
          energyReportFileService.uploadEnergyReportsFromFile(filePath);
          return "File uploaded successfully";
      }catch (Exception e){
          e.printStackTrace();
      }          return "File uploaded failed";

    }



}
