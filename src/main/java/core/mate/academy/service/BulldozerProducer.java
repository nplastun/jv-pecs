package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        bulldozers.add(new Bulldozer("Iveco", "White"));
        bulldozers.add(new Bulldozer("Renault", "Black"));
        bulldozers.add(new Bulldozer("Liebherr", "Green"));

        return bulldozers;
    }
}

