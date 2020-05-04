package com.example.rams.Entities;
import com.example.rams.ElectionType;

import javax.persistence.*;

@Entity
public class ElectionData {

    public ElectionData() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int electionDataID;

    @Column(name = "DemocraticVotes")
    private int demVotes;

    @Column(name = "RepublicanVotes")
    private int repVotes;

    @Column(name = "ElectionType")
    private ElectionType electionType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="area_id") //new col in election table called area_id which will be a FK
    private Area areaForElection;


    public int getElectionDataID() {
        return electionDataID;
    }

    public int getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(int demVotes) {
        this.demVotes = demVotes;
    }

    public int getRepVotes() {
        return repVotes;
    }

    public void setRepVotes(int repVotes) {
        this.repVotes = repVotes;
    }

    public ElectionType getElectionType() {
        return electionType;
    }

    public void setElectionType(ElectionType electionType) {
        this.electionType = electionType;
    }

    public void setElectionDataID(int electionDataID) {
        this.electionDataID = electionDataID;
    }

    public Area getAreaForElection() {
        return areaForElection;
    }

    public void setAreaForElection(Area areaForElection) {
        this.areaForElection = areaForElection;
    }
}