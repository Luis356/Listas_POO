package Interface_Abstrata.Exercicio_1;

public class GerenciamentoVeiculos {

    private Veiculo[] veiculos = new Veiculo[10];
    private int contadorVeiculos = 0;

    public static void main(String[] args) {
        GerenciamentoVeiculos gerVeiculos = new GerenciamentoVeiculos();

        Caminhao caminhao = new Caminhao("PLACA-CAMINHÃO", "MARCA-CAMINHÃO", "MODELO-CAMINHÃO", 400.0, 12000, 4, 3);
        gerVeiculos.adicionarVeiculo(caminhao);

        Carro carro = new Carro("PLACA-CARRO", "MARCA-CARRO", "MODELO-CARRO", 200.0);
        gerVeiculos.adicionarVeiculo(carro);

        Moto moto = new Moto("PLACA-MOTO", "MARCA-MOTO", "MODELO-MOTO", 150.0);
        gerVeiculos.adicionarVeiculo(moto);

        gerVeiculos.exibirRelatorio();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (contadorVeiculos < veiculos.length) {
            veiculos[contadorVeiculos] = veiculo;
            contadorVeiculos++;
            System.out.println("Veículo adicionado com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais veículos. Capacidade máxima atingida.");
        }
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Veículos Cadastrados:");
        for (int i = 0; i < contadorVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            System.out.println("------------------------------------");
            if (veiculo instanceof Caminhao) {
                System.out.println("Tipo: Caminhao");
            } else if (veiculo instanceof Carro) {
                System.out.println("Tipo: Carro");
            } else if (veiculo instanceof Moto) {
                System.out.println("Tipo: Moto");
            } else {
                System.out.println("Tipo: Veiculo desconhecido");
            }
            System.out.println("Placa: " + veiculo.placa);
            System.out.println("Marca: " + veiculo.marca);
            System.out.println("Modelo: " + veiculo.modelo);
            System.out.println("Valor Diária: R$" + veiculo.valorDiaria);
            System.out.println("Aluguel para 5 dias: R$" + veiculo.calcularAluguel(5));
        }
    }
}
