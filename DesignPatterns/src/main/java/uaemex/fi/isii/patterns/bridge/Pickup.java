package uaemex.fi.isii.patterns.bridge;

public class Pickup implements WorkAction {
    @Override
    public void workActivity(String origen, String destino) {
        System.out.println("Recogiendo paquete en " + origen + ". De camino a " + destino);
    }
}
