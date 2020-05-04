package com.example.rams.Entities;

import java.util.Set;
import javax.persistence.*;

@Entity
public class State extends Area {

    @Column(name = "Districts")
    @OneToMany(mappedBy = "stateForDistrict")
    private Set<District> districts;


    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }


}

