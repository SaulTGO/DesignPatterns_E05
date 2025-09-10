package uaemex.fi.isii.patterns;

import uaemex.fi.isii.patterns.factory.Ship;
import uaemex.fi.isii.patterns.prototype.Prototype;

public class Main {
    public static void main(String[] args) {

        Prototype shipWind = new Ship("Viento");

        Prototype shipFuel = shipWind.clone();

        System.out.println(shipWind);
        System.out.println(shipFuel);

    }
}
