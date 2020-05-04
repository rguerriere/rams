package com.example.rams.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@GeneratedValue(strategy = GenerationType.TABLE)
public class Area {

    public Area() {

    }

    public Area(String name, ArrayList<ArrayList<Double>> coordinates, int demographicDataID, ArrayList<Integer> electionDataID) {
        this.name = name;
        this.coordinates = coordinates;
        //this.demoGraphicDataID = demographicDataID;
        //this.electionDataIDs = electionDataIDs;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AreaID")
    public Integer areaId;

    @Column(name="Name")
    private String name;

    @Column(name = "Coordinates")
    private ArrayList<ArrayList<Double>> coordinates;

    @OneToOne(mappedBy = "areaForDemographic")
    ////@JoinColumn(name = "areaForDemographicData")
    private DemographicData demographicData;

    //@OneToMany(cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "areaForElection")
    private List<ElectionData> electionData;

    //GETTERS AND SETTERS FOR AREA
    public Integer getId() {
        return areaId;
    }

    public void setId(Integer id) {
        areaId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ArrayList<Double>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<ArrayList<Double>> geometry) {
        this.coordinates = geometry;
    }

    public DemographicData getDemographicData() {
        return new DemographicData();
    }

    public List<ElectionData> getElectionData() {
        return electionData;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public void setDemographicData(DemographicData demographicData) {
        this.demographicData = demographicData;
    }

    public void setElectionData(List<ElectionData> electionData) {
        this.electionData = electionData;
    }
}