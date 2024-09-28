import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    Fazenda fazendinha = new Fazenda();
    Cultura milhozinho = new Milho();
    Cultura tomatezinho = new Tomate();
    Cultura batatinha = new Batata();
    Animal Galinhazinha = new Galinha();
    Animal Ovelhazinha = new Ovelha();
    Animal Vacazinha = new Vaca();

    public Menu() {
        System.out.println("Bem-vindo a fazenda feliz!\nPor gentileza, defina o nome de sua fazenda: ");
        fazendinha.NomeFazenda = scan.next();
    }

    public void MenuAcoes() {
        char verEntrada;

        do {
            System.out.println(
                    "\nFazenda '" + fazendinha.NomeFazenda
                            + "'\nEscolha uma ação:\nGerenciar a plantação (P/p)\nGerenciar os animais (A/a)\nConferir os recursos (R/r)\nPassar o dia (D/d)\nSair (S/s)\nOpção:");
            verEntrada = scan.next().charAt(0);

            switch (verEntrada) {
                case 'p', 'P' -> MenuPlantacao();
                case 'a', 'A' -> MenuAnimais();
                case 'r', 'R' -> RecursosDisponiveis();
                case 'd', 'D' -> PassarDia();
                case 's', 'S' -> System.out.println("Saindo do jogo...");
                default -> System.out.println("Opção inválida.");

            }

        } while (verEntrada != 's' && verEntrada != 'S');
    }

    public void MenuPlantacao() {
        System.out.println(
                "\n\n" + fazendinha.NomeFazenda
                        + " (Água: " + fazendinha.AguaDisponivel + " Fertilizante: "
                        + fazendinha.FertilizanteDisponivel
                        + " Moedas: " + fazendinha.MoedasDisponivel
                        + ") \nVocê pode plantar as seguitnes culturas:\n\nMilho (M/m):\nÁgua -"
                        + milhozinho.AguaNecessaria
                        + "\nMoedas -" + milhozinho.MoedasNecessarias
                        + "\nFertilizante -" + milhozinho.FertilizanteNecessario
                        + "\nDias de crescimento: " + milhozinho.TempoCrescimento
                        + "\n\nBatata (B/b):\nÁgua -" + batatinha.AguaNecessaria
                        + "\nMoedas -" + batatinha.MoedasNecessarias
                        + "\nFertilizante -" + batatinha.FertilizanteNecessario
                        + "\nDias de crescimento: " + batatinha.TempoCrescimento
                        + "\n\nTomate (T/t):\nÁgua -" + tomatezinho.AguaNecessaria
                        + "\nMoedas -" + tomatezinho.MoedasNecessarias
                        + "\nFertilizante -" + tomatezinho.FertilizanteNecessario
                        + "\nDias de crescimento: " + tomatezinho.TempoCrescimento
                        + "\n\nConferir plantações(C/c)\nOpção:");

        char verPlanta = scan.next().charAt(0);
        switch (verPlanta) {
            case 'm', 'M' -> fazendinha.Plantar(milhozinho);
            case 'b', 'B' -> fazendinha.Plantar(batatinha);
            case 't', 'T' -> fazendinha.Plantar(tomatezinho);
            case 'c', 'C' -> MenuVisualizarPlantacao();
            default -> System.out.println("Opção inválida.");
        }
    }

    public void MenuAnimais() {
        System.out.println(

                "\n" + fazendinha.NomeFazenda
                        + " (Ração: " + fazendinha.RacaoDisponivel + " Moedas: " + fazendinha.MoedasDisponivel
                        + ") \nVocê pode criar os seguintes animais:\n\nGalinha (G/g)\nRação diaria -"
                        + Galinhazinha.ConsumoRacao
                        + "\nMoedas -" + Galinhazinha.MoedasNecessarias
                        + "\nProdução diaria: " + Galinhazinha.ProducaoDiaria
                        + "\n\nOvelha (O/o)\nRação diaria -"
                        + Ovelhazinha.ConsumoRacao
                        + "\nMoedas -" + Ovelhazinha.MoedasNecessarias
                        + "\nProdução diaria: " + Ovelhazinha.ProducaoDiaria
                        + "\n\nVaca (V/v)\nRação diaria -"
                        + Vacazinha.ConsumoRacao
                        + "\nMoedas -" + Vacazinha.MoedasNecessarias
                        + "\nProdução diaria: " + Vacazinha.ProducaoDiaria
                        + "\nVisualizar animais (T/t)\nOpção:"

        );

        char verAnimal = scan.next().charAt(0);
        switch (verAnimal) {
            case 'g', 'G' -> {

                if (fazendinha.VerificaRecursosAnimal(Galinhazinha.ConsumoRacao, Galinhazinha.MoedasNecessarias)) {
                    fazendinha.CriarAnimal(new Galinha());
                }
            }
            case 'o', 'O' -> {

                if (fazendinha.VerificaRecursosAnimal(Ovelhazinha.ConsumoRacao, Ovelhazinha.MoedasNecessarias)) {
                    fazendinha.CriarAnimal(new Ovelha());
                }

            }
            case 'v', 'V' -> {

                if (fazendinha.VerificaRecursosAnimal(Vacazinha.ConsumoRacao, Vacazinha.MoedasNecessarias)) {
                    fazendinha.CriarAnimal(new Vaca());
                }

            }
            case 'a', 'A' -> {

                if (!fazendinha.animais.isEmpty()) {
                    fazendinha.AlimentarAnimais();
                } else {
                    System.out.println("Não há animais para alimentar.");
                }
            }
            case 't', 'T' -> {
                MenuVisualizarAnimais();
            }
            default -> System.out.println("Opção inválida.");
        }
    }

    public void MenuVisualizarAnimais() {
        if (fazendinha.animais.isEmpty()) {
            System.out.println("Não há animais criados na fazenda " + fazendinha.NomeFazenda);
            return;
        }

        System.out.println("Animais na fazenda " + fazendinha.NomeFazenda + ":");
        for (Animal animal : fazendinha.animais) {
            System.out.println(

                    "Animal: " + animal.NomeAnimal +
                            ", Idade: " + animal.IdadeAnimal +
                            ", Produção diária: " + animal.ProducaoDiaria);

        }
        System.out.println("\nDeseja coletar as produções? (S/n): ");
        char varColetar = scan.next().charAt(0);
        switch (varColetar) {

            case 's', 'S' -> {
                if (!fazendinha.animais.isEmpty()) {
                    fazendinha.ColetarProducaoAnimais();
                } else {
                    System.out.println("Não há animais para coletar produção.");
                }

            }
            case 'n', 'N' -> {
                System.out.println("Coleta de produção não realizada.");
            }
            default -> System.out.println("Opção inválida.");
        }
    }

    public void MenuVisualizarPlantacao() {

        if (fazendinha.culturas.isEmpty()) {
            System.out.println("Não há culturas plantadas na fazenda " + fazendinha.NomeFazenda);
            return;
        }

        System.out.println(
                "Deseja visualizar as informações de qual cultura:\nMilho (M/m)\nBatata (B/b)\nTomate (T/t)\nTodas(V/v)\nOpção:");
        char varVisu = scan.next().charAt(0);

        switch (varVisu) {
            case 'm', 'M' -> visualizarCulturaEspecifica("Milho");
            case 'b', 'B' -> visualizarCulturaEspecifica("Batata");
            case 't', 'T' -> visualizarCulturaEspecifica("Tomate");
            case 'v', 'V' -> visualizarTodasCulturas();
            default -> System.out.println("Opção inválida.");
        }

    }

    private void visualizarCulturaEspecifica(String nomeCultura) {
        boolean culturaEncontrada = false;
        for (Cultura cultura : fazendinha.culturas) {
            if (cultura.NomeCultura.equalsIgnoreCase(nomeCultura)) {
                DadosPlanta(cultura);
                culturaEncontrada = true;
                VaiColher(cultura);
            }
        }
        if (!culturaEncontrada) {
            System.out.println("Nenhuma cultura de " + nomeCultura + " encontrada.");
        }
    }

    public void DadosPlanta(Cultura planta) {
        System.out.println("\nCultura: " + planta.NomeCultura + "\nDias crescidos: " + planta.DiasCrescimento
                + "\nSituação: " + (planta.Madura ? "Madura" : "Verde"));
    }

    private void visualizarTodasCulturas() {
        for (int i = fazendinha.culturas.size() - 1; i >= 0; i--) {
            Cultura cultura = fazendinha.culturas.get(i);
            DadosPlanta(cultura);
            if (VaiColher(cultura)) {
                fazendinha.culturas.remove(i);
            }
        }
    }

    public boolean VaiColher(Cultura plantaColher) {
        System.out.println("Deseja colher? (S/s para sim ou N/n para não)");
        char opcaoColher = scan.next().charAt(0);
        if (opcaoColher == 'S' || opcaoColher == 's') {
            int valorColhido = plantaColher.Colher();
            if (valorColhido > 0) {
                fazendinha.MoedasDisponivel += valorColhido;
                return true;
            }
        }
        return false;
    }

    public void RecursosDisponiveis() {
        System.out.println(
                "\nRecursos disponíveis na fazenda " + fazendinha.NomeFazenda + ": \nÁgua: "
                        + fazendinha.AguaDisponivel + "\nFertilizante: " + fazendinha.FertilizanteDisponivel
                        + "\nRação: " + fazendinha.RacaoDisponivel
                        + "\nMoedas: " + fazendinha.MoedasDisponivel);
    }

    public void PassarDia() {
        System.out.println("Quantos dias você deseja passar?");
        int diasParaPassar = scan.nextInt();

        for (int i = 0; i < diasParaPassar; i++) {
            fazendinha.PassarDia();
        }
        System.out.println("Passaram: " + diasParaPassar + " dias na fazenda " + fazendinha.NomeFazenda + "!");
    }

}