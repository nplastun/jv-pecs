package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        trucks.add(new Truck("Truck1", "Red"));
        trucks.add(new Truck("Truck2", "Green"));
        trucks.add(new Truck("Truck3", "Black"));

        return trucks;
    }
}

