package ListaCompleta;

public class Smartphone extends Celular {

    protected String sistema;

    public Smartphone(String numero, String modelo, String operadora, String sistemaOperacional) {
        super(numero, modelo, operadora);
        this.sistema = sistemaOperacional;
    }

    @Override
    public void Ligar() {
        System.out.println("\nLigando para o número do smartphone: " + numeroDispositivo + " usando o modelo "
                + modeloDispositivo + " com " + sistema);
    }

    public void AcessarInternet() {
        System.out.println("Acessando a internet pelo smartphone com " + sistema);
    }

    public void EnviarMensagem(String mensagem, String tipoArquivo) {
        System.out.println(
                "Enviando mensagem com mídia para " + numeroDispositivo + " via " + operadora + " usando " + sistema);
    }

    public void MostraDetalhes() {
        System.out.println("DETALHES: Smartphone - Número: " + numeroDispositivo +
                ", Modelo: " + modeloDispositivo +
                ", Operadora: " + operadora +
                ", Sistema Operacional: " + sistema);
    }

}
