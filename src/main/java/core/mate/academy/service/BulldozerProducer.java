package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        bulldozers.add(new Bulldozer("Iveco", "White", 1998));
        bulldozers.add(new Bulldozer("Renault", "Black", 2000));
        bulldozers.add(new Bulldozer("Liebherr", "Green", 2001));

        return bulldozers;
    }
}

