package Interface_Abstrata.Exercicio_2;

public class Cheque extends Pagamento {

    protected boolean aprovado;

    public Cheque(double valorTotal, boolean aprovado) {
        super(valorTotal);
        this.aprovado = aprovado;
    }

    @Override
    public double calcularValorTotal() {

        if (aprovado) {
            
            return valorTotal;
        
        } else {

            return valorTotal + (valorTotal * 0.20);
        
        }
    }
}
