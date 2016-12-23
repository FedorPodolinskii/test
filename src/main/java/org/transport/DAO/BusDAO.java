package org.transport.DAO;

import org.transport.entities.Bus;
import java.util.List;

/**
 * Created by Super-Fedya on 22.12.2016.
 */

public interface BusDAO {
    void incert(Bus bus);

    List<Bus> findAllBuses();
}
