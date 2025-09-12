package uaemex.fi.isii.patterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton (){
        //Constructor privado
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return null;
    }

    public void showMessage(){
        System.out.println("Hello, I am singleton");
    }
}
