package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> listMachines;
        if (type.equals(Bulldozer.class)) {
            listMachines = new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            listMachines = new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            listMachines = new TruckProducer().get();
        } else {
            listMachines = new ArrayList<>();
        }
        return new ArrayList<>(listMachines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Workable mashine : machines) {
            mashine.doWork();
        }
    }
}
