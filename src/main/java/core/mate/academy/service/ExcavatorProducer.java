package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator1", "White"));
        excavators.add(new Excavator("Excavator2", "Red"));
        excavators.add(new Excavator("Excavator3", "Black"));

        return excavators;
    }
}
