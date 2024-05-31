package com.visulization.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "energy_reports")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnergyReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "end_year", length = 2500)
    @JsonProperty("end_year")
    private String endYear;

    @Column(name = "intensity")
    @JsonProperty("intensity")
    private String intensity;

    @Column(name = "sector", length = 2500)
    @JsonProperty("sector")
    private String sector;

    @Column(name = "topic", length = 2500)
    @JsonProperty("topic")
    private String topic;

    @Column(name = "insight", length = 2500)
    @JsonProperty("insight")
    private String insight;

    @Column(name = "url", length = 2500)
    @JsonProperty("url")
    private String url;

    @Column(name = "region", length = 2500)
    @JsonProperty("region")
    private String region;

    @Column(name = "start_year", length = 2500)
    @JsonProperty("start_year")
    private String startYear;

    @Column(name = "impact", length = 2500)
    @JsonProperty("impact")
    private String impact;

    //    @Column(name = "added", columnDefinition = "TIMESTAMP")
//    @Temporal(TemporalType.TIMESTAMP)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM, dd yyyy HH:mm:ss")
//    private Date added;
    @Column(name = "added", length = 2500)
    @JsonProperty("added")
    private String added;

//    @Column(name = "published", columnDefinition = "TIMESTAMP")
//    @Temporal(TemporalType.TIMESTAMP)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM, dd yyyy HH:mm:ss")
//    private Date published;

    @Column(name = "published", length = 2500)
    @JsonProperty("published")
    private String published;

    @Column(name = "country", length = 2500)
    @JsonProperty("country")
    private String country;

    @Column(name = "relevance", length = 2500)
    @JsonProperty("relevance")
    private String relevance;

    @Column(name = "pestle", length = 2500)
    @JsonProperty("pestle")
    private String pestle;

    @Column(name = "source", length = 2500)
    @JsonProperty("source")
    private String source;

    @Column(name = "title", length = 2500)
    @JsonProperty("title")
    private String title;

    @Column(name = "likelihood")
    @JsonProperty("likelihood")
    private int likelihood;
}
