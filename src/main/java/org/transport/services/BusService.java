package org.transport.services;

import org.transport.entities.Bus;

import java.util.List;

/**
 * Created by Super-Fedya on 23.12.2016.
 */
public interface BusService {
    void addBus(Bus bus);

    List<Bus> findAllBuses();
}
