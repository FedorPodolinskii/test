package org.transport.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Super-Fedya on 21.12.2016.
 */
@Entity
@Table (name = "Stations")
public class Station {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer StationID;

    @Column (unique = true,nullable = false)
    private String stationName;

    private Bus bus;

    @ManyToOne(optional = false)
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Integer getStationID() {
        return StationID;
    }

    public void setStationID(Integer stationID) {
        StationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
