package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private static final int AMOUNT_MODELS = 3;
    private List<Excavator> listOfExcavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        for (int i = 0; i < AMOUNT_MODELS; i++) {
            listOfExcavators.add(new Excavator());
        }
        return listOfExcavators;
    }
}
