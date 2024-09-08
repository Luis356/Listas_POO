package Interface_Abstrata.Exercicio_2;

public class CartaDeCredito extends Pagamento {

    protected int numParcelas;

    public CartaDeCredito(double valorTotal, int numParcelas) {
        super(valorTotal);
        this.numParcelas = numParcelas;
    }

    @Override
    public double calcularValorTotal() {

        double valorFinal = valorTotal;

        // Aplica um acréscimo de 2% para cada parcela adicional acima de 1
        if (numParcelas > 1) {
            // Acréscimo total é (numeroParcelas - 1) * 2%
            double acrescimo = (numParcelas - 1) * 0.02 * valorTotal;
            valorFinal += acrescimo;
        }

        return valorFinal;
    }

}
