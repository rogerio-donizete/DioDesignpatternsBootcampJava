package subsistemacep;

import singleton.SingletonLazy;

public class CepApi {

    private static  CepApi instacia;

    private CepApi() {
        super();
    }

    public static CepApi getInstacia (){
        if(instacia==null){
            instacia=new CepApi();
        }
        return instacia;
    }

    public String recuperarCidade(String cep){
        return "Santo André";
    }

    public String recuperarEstado(String cep){
        return "São paulo";
    }
}
