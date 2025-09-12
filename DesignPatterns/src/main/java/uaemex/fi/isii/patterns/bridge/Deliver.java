package uaemex.fi.isii.patterns.bridge;

public class Deliver implements WorkAction {

    @Override
    public void workActivity(String origen, String destino) {
        System.out.println("Entregando paquete en " + origen + " para " + destino);
    }

}
