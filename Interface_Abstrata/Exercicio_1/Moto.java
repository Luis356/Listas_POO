package Interface_Abstrata.Exercicio_1;

import Interface_Abstrata.Exercicio_1.Interfaces.IPassageiro;

public class Moto extends Veiculo implements IPassageiro {

    protected boolean temSidecar;
    protected int quantidadeLugares;

    public Moto(String placa, String marca, String modelo, double valorDiaria) {
        super(placa, marca, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = valorDiaria * dias;

        if (temSidecar) {
            return total - (total * 0.10);
        }
        return total;
    }

    @Override
    public int calcularQuantidade() {
        return quantidadeLugares;
    }
}
