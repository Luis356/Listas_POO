package Interface_Abstrata.Exercicio_1;

import Interface_Abstrata.Exercicio_1.Interfaces.IPassageiro;

public class Carro extends Veiculo implements IPassageiro {

    protected int numeroPortas;
    protected int quantidadeLugares;

    public Carro(String placa, String marca, String modelo, double valorDiaria) {
        super(placa, marca, modelo, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = valorDiaria * dias;

        if (dias >= 7) {
            return total - (total * 0.05);
        }
        return total;
    }

    @Override
    public int calcularQuantidade() {

        return quantidadeLugares;

    }

}
