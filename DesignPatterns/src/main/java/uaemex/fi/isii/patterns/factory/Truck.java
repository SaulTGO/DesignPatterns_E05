package uaemex.fi.isii.patterns.factory;

public class Truck implements Factory {
    @Override
    public void deliver(){
        System.out.println("Entrega de caja");
    }
}
