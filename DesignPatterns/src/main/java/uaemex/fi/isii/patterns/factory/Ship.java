package uaemex.fi.isii.patterns.factory;

import uaemex.fi.isii.patterns.prototype.Prototype;

public class Ship implements Prototype,  Factory {
    private String propulsion;

    public Ship(String propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public void deliver(){
        System.out.println("Entrega de un contenedor");
    }

    @Override
    public Prototype clone(){
        return new Ship(this.propulsion);
    }

}
