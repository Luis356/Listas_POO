package Interface_Abstrata.Exercicio_2;

public abstract class Pagamento {

    protected double valorTotal;

    public Pagamento(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public abstract double calcularValorTotal();
}
