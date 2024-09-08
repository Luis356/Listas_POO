package Interface_Abstrata.Exercicio_1;

import Interface_Abstrata.Exercicio_1.Interfaces.IPesado;

public class Caminhao extends Veiculo implements IPesado {

    protected double pesoCarga;
    protected double taxaPeso;
    protected int eixos;

    public Caminhao(String placa, String marca, String modelo, double valorDiaria, double pesoCarga, double taxaPeso,
            int eixos) {
        super(placa, marca, modelo, valorDiaria);
        this.pesoCarga = pesoCarga;
        this.eixos = eixos;
        this.taxaPeso = taxaPeso;

    }

    @Override
    public double calcularAluguel(int dias) {
        double total = valorDiaria * dias;

        if (eixos > 2) {
            return total + ((total * 0.02) * eixos);
        }
        return total;
    }

    @Override
    public double calcularTaxaPeso() {
        return (pesoCarga / 100) * taxaPeso;
    }

}
