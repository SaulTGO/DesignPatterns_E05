package uaemex.fi.isii.patterns.factory;

import uaemex.fi.isii.patterns.bridge.TransportBridge;
import uaemex.fi.isii.patterns.bridge.WorkAction;

public class Truck extends TransportBridge implements Transport{

    public Truck(WorkAction pickup, WorkAction travel, WorkAction deliver) {
        super(pickup, travel, deliver);
    }

    @Override
    public void deliver(){
        System.out.println("----------Camion empieza proceso----------");
        pickup.workActivity("Bodega", " FI ");
        travel.workActivity("Bodega", " FI ");
        deliver.workActivity("FI", "Marcelo");
    }



}
