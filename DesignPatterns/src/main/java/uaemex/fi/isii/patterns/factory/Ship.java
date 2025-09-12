package uaemex.fi.isii.patterns.factory;

import uaemex.fi.isii.patterns.bridge.TransportBridge;
import uaemex.fi.isii.patterns.bridge.WorkAction;
import uaemex.fi.isii.patterns.prototype.Prototype;

public class Ship extends TransportBridge{
    private String propulsion;

    public Ship(WorkAction pickup, WorkAction travel, WorkAction deliver) {
        super(pickup, travel, deliver);
    }

    @Override
    public void deliver(){
        System.out.println("----------Barco empieza proceso----------");
        pickup.workActivity("China", "Puerto de Michoacan");
        travel.workActivity("China", "Puerto de Michoacan");
        deliver.workActivity("Puerto de Michoacan", "Bodegas");
    }

}
