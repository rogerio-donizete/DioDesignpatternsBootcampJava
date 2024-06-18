package facade;

import subsistema1.CrmService;
import subsistemacep.CepApi;

public class Facade {
    public Facade() {
        super();
    }

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstacia().recuperarCidade(cep);
        String estado = CepApi.getInstacia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
