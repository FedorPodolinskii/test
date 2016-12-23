package org.transport.entities;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Super-Fedya on 21.12.2016.
 */
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Bus busNumber;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date date;


    public Bus getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Bus busNumber) {
        this.busNumber = busNumber;
    }
}
