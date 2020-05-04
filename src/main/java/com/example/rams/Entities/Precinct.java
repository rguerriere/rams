package com.example.rams.Entities;

import java.util.List;
import javax.persistence.*;

@Entity
public class Precinct extends Area {

    /*public Precinct(Integer id, String name, ArrayList<ArrayList<Double>> coordinates, DemographicData demographicData, ElectionData electionData, String canonicalName, List<Integer> neighborsIDs, int stateID, List<ErrorData> errorsList, boolean isGhost) {
        super(id, name, coordinates, demographicData, electionData);
        this.canonicalName = canonicalName;
        this.stateID = stateID;
        this.neighborsIds = neighborsIds;
        this.errorsList = errorsList;
        this.isGhost = isGhost;
    }*/


    private String canonicalName;

    @ManyToMany(mappedBy = "neighborPrecinct")
    private List<Precinct> neighbors;

    @ManyToMany
    @JoinTable(name = "neighbors")
    private List<Precinct> neighborPrecinct;

    @OneToMany(mappedBy = "precinctForError")
    private List<ErrorData> errors;

    private boolean isGhost;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "district_ID")
    private District districtForPrecinct;

    public void toggleNeighbor(int otherID) {
    }

    public void initGhost() {
        this.isGhost = true;
    }

    public void absorbPrecinct(int areaID) {
        //merge the boundaries
        //delete the other precinct
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public List<Precinct> getNeighbors() {
        return neighbors;
    }

    public void setNeighborsIds(List<Precinct> neighbors) {
        this.neighbors = neighbors;
    }

    public List<ErrorData> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorData> errors) {
        this.errors = errors;
    }

    public boolean isGhost() {
        return isGhost;
    }

    public void setGhost(boolean ghost) {
        isGhost = ghost;
    }

    public void setNeighbors(List<Precinct> neighbors) {
        this.neighbors = neighbors;
    }

    public List<Precinct> getNeighborPrecinct() {
        return neighborPrecinct;
    }

    public void setNeighborPrecinct(List<Precinct> neighborPrecinct) {
        this.neighborPrecinct = neighborPrecinct;
    }

    public District getDistrictForPrecinct() {
        return districtForPrecinct;
    }

    public void setDistrictForPrecinct(District districtForPrecinct) {
        this.districtForPrecinct = districtForPrecinct;
    }
}
