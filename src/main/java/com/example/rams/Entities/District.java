package com.example.rams.Entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class District extends Area {

    public District(ArrayList<Precinct> precincts) {

    }

    @Column(name = "Precincts")
    @OneToMany(mappedBy = "districtForPrecinct")
    private List<Precinct> precincts;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_ID")
    private State stateForDistrict;


    public List<Precinct> getPrecincts() {
        return precincts;
    }

    public void setPrecincts(List<Precinct> precincts) {
        this.precincts = precincts;
    }

    public State getStateForDistrict() {
        return stateForDistrict;
    }

    public void setStateForDistrict(State stateForDistrict) {
        this.stateForDistrict = stateForDistrict;
    }
}
