package singleton;

public class SingletonLazy {


    /**
     * singleton preguiçoso
     *
     *
     */
    private static SingletonLazy instacia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstacia (){
        if(instacia==null){
            instacia=new SingletonLazy();
        }
        return instacia;
    }
}
