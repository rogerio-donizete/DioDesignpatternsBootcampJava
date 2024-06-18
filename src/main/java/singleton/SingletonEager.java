package singleton;

public class SingletonEager {

    /**
     * singleton apressado
     */

    private static  SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }

}
