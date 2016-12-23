package org.transport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.transport.DAO.BusDAOImpl;
import org.transport.entities.Bus;

import java.util.List;

/**
 * Created by Super-Fedya on 23.12.2016.
 */
@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusDAOImpl dao;

    public void addBus(Bus bus) {
        dao.incert(bus);
    }

    public List<Bus> findAllBuses() {
        return dao.findAllBuses();
    }
}
