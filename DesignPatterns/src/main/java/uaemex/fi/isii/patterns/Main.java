package uaemex.fi.isii.patterns;

import uaemex.fi.isii.patterns.adapter.Persona;
import uaemex.fi.isii.patterns.adapter.PersonaDeliverAdapter;
import uaemex.fi.isii.patterns.bridge.Deliver;
import uaemex.fi.isii.patterns.bridge.Pickup;
import uaemex.fi.isii.patterns.bridge.Travel;
import uaemex.fi.isii.patterns.factory.Ship;
import uaemex.fi.isii.patterns.factory.Transport;
import uaemex.fi.isii.patterns.factory.Truck;
import uaemex.fi.isii.patterns.prototype.Prototype;

public class Main {
    public static void main(String[] args) {

        Ship ship = new Ship(new Pickup(), new Travel(), new Deliver());
        ship.deliver();

        Truck truck = new Truck(new Pickup(), new Travel(),new Deliver());
        truck.deliver();

    }
}
