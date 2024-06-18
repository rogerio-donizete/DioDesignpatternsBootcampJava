import org.strategy.*;

public class TestStrategy {
    public static void main(String[] args) {

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agresivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agresivo);
        robo.mover();
        robo.mover();

    }

}
