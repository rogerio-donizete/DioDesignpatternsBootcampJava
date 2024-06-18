package singleton;

public class SingletonLazyHolder {


    /**
     * singleton preguiçoso com maior otimização de memoria
     *
     *
     */
    private static SingletonLazyHolder instacia;

    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstacia (){
       return Holder.instancia;
    }
}
