package org.transport.entities;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;
import java.sql.Array;

/**
 * Created by Super-Fedya on 21.12.2016.
 */
@Entity
public class Bus implements java.io.Serializable{
    private Integer busID;
    private ArrayList<Station> stations;
    private Integer capacity;


    @Id
    @Column(unique = true, nullable = false)
    public Integer getBusID() {
        return busID;
    }

    public void setBusID(Integer busID) {
        this.busID = busID;
    }

    @OneToMany(mappedBy = "bus")
    public List<Station> getStations() {
        return stations;
    }

    public void setStations(ArrayList<Station> stations) {
        this.stations = stations;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    private Collection<Ticket> ticket;

    @OneToMany(mappedBy = "bus")
    public Collection<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(Collection<Ticket> ticket) {
        this.ticket = ticket;
    }
}
