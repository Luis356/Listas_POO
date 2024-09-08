package Heranca_Polimorfismo;

public class Celular extends DispositivoTelefonico {

    protected String operadora;

    public Celular(String numero, String modelo, String operadoraCelular) {
        super(numero, modelo);
        this.operadora = operadoraCelular;
    }

    @Override
    public void Ligar() {
        System.out.println("\nLigando para o número de celular: " + numeroDispositivo
                + " usando o modelo: " + modeloDispositivo + " da operadora: " + operadora);
    }

    public void EnviarMensagem(String mensagem) {
        System.out.println("\nEnviando mensagem: '" + mensagem + "' para "
                + numeroDispositivo + " via " + operadora);
    }

    public void MostraDetalhes() {
        System.out.println("DETALHES: Celular - Número: " + numeroDispositivo +
                ", Modelo: " + modeloDispositivo +
                ", Operadora: " + operadora);
    }

}
