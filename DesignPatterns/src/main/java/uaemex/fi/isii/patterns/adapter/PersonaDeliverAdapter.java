package uaemex.fi.isii.patterns.adapter;
import uaemex.fi.isii.patterns.factory.Transport;

public class PersonaDeliverAdapter implements Transport{

    @Override
    public void deliver(){
        Persona persona = new Persona();
        persona.deliverPackage();
    }
}
