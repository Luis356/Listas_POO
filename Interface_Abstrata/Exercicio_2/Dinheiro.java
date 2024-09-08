package Interface_Abstrata.Exercicio_2;

public class Dinheiro extends Pagamento {

    public Dinheiro(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public double calcularValorTotal() {

        return valorTotal - (valorTotal * 0.10);

    }

}
