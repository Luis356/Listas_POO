package Interface_Abstrata.Exercicio_2;

public class GerenciaPagamentos {

    private Pagamento[] pagamentos = new Pagamento[5];
    private int contadorPagamentos;

    public static void main(String[] args) {
        GerenciaPagamentos gerPagamentos = new GerenciaPagamentos();

        Dinheiro dinheiro = new Dinheiro(100.0);
        gerPagamentos.adicionarPagamento(dinheiro);
        CartaDeCredito cartao = new CartaDeCredito(100.0, 3);
        gerPagamentos.adicionarPagamento(cartao);
        Cheque cheque = new Cheque(100.0, true);
        gerPagamentos.adicionarPagamento(cheque);
        Cheque cheque2 = new Cheque(100.0, false);
        gerPagamentos.adicionarPagamento(cheque2);

        gerPagamentos.exibirRelatorio();

    }

    public boolean adicionarPagamento(Pagamento pagamento) {
        if (contadorPagamentos < pagamentos.length) {
            pagamentos[contadorPagamentos] = pagamento;
            contadorPagamentos++;
            return true; 
        } else {
            System.out.println("Capacidade máxima de pagamentos atingida.");
            return false; 
        }
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Pagamentos:");
        for (int i = 0; i < contadorPagamentos; i++) {
            Pagamento pagamento = pagamentos[i];
            System.out.println("------------------------------------");
            System.out.println("Tipo de Pagamento: " + pagamento.getClass().getSimpleName());
            System.out.println("Valor Final: R$" + pagamento.calcularValorTotal());
        }
    }

}
