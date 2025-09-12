package uaemex.fi.isii.patterns.bridge;

public class Travel implements WorkAction{

    @Override
    public void workActivity(String origen, String destino) {
        System.out.println("Viajando desde " + origen + " hacia " + destino);
    }
}
