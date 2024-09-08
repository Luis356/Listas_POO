package Heranca_Polimorfismo;

public class TelefoneFixo extends DispositivoTelefonico {

    public TelefoneFixo(String numero, String modelo) {
        super(numero, modelo);
    }

    @Override
    public void Ligar() {
        System.out.println("\nLigando para o número: " + numeroDispositivo + " usando o modelo " + modeloDispositivo);
    }

    public void VerificarLinhaTelefonica() {
        System.out.println("\nVerificando a linha telefonica para o número fixo: " + numeroDispositivo);
    }

    public void MostraDetalhes() {
        System.out.println("DETALHES: Telefone - Número: " + numeroDispositivo +
                ", Modelo: " + modeloDispositivo);
    }

}
