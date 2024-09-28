import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    protected List<Cultura> culturas;
    protected List<Animal> animais;
    protected String NomeFazenda;
    protected int AguaDisponivel;
    protected int FertilizanteDisponivel;
    protected int RacaoDisponivel;
    protected int MoedasDisponivel;

    public Fazenda() {
        this.culturas = new ArrayList<>();
        this.animais = new ArrayList<>();
        this.AguaDisponivel = 50;
        this.FertilizanteDisponivel = 100;
        this.MoedasDisponivel = 20;
        this.RacaoDisponivel = 30;
    }

    public void Plantar(Cultura varCulturas) {
        for (Cultura c : culturas) {
            if (c.NomeCultura.equalsIgnoreCase(varCulturas.NomeCultura)) {
                System.out
                        .println("Você já plantou " + varCulturas.NomeCultura + ". Colha antes de plantar novamente.");
                return;
            }
        }

        if (VerificaRecursosPlanta(varCulturas.AguaNecessaria, varCulturas.FertilizanteNecessario,
                varCulturas.MoedasNecessarias)) {
            varCulturas.Plantar();
            this.AguaDisponivel -= varCulturas.AguaNecessaria;
            this.FertilizanteDisponivel -= varCulturas.FertilizanteNecessario;
            this.MoedasDisponivel -= varCulturas.MoedasNecessarias;
            this.culturas.add(varCulturas); // Adiciona a cultura à lista

            System.out.println("Você plantou " + varCulturas.NomeCultura);
        } else {
            System.out.println("Recursos insuficientes para plantar " + varCulturas.NomeCultura);
        }
    }

    public boolean VerificaRecursosPlanta(int aguaNecessaria, int fertilizanteNecessario, int moedasNecessarias) {
        boolean faltaAgua = AguaDisponivel < aguaNecessaria;
        boolean faltaFertilizante = FertilizanteDisponivel < fertilizanteNecessario;
        boolean faltaMoedas = MoedasDisponivel < moedasNecessarias;

        if (faltaAgua) {
            System.out.println("Água insuficiente: disponível " + AguaDisponivel + ", necessário " + aguaNecessaria);
            return false;
        }
        if (faltaFertilizante) {
            System.out.println("Fertilizante insuficiente: disponível " + FertilizanteDisponivel + ", necessário "
                    + fertilizanteNecessario);
            return false;
        }
        if (faltaMoedas) {
            System.out.println(
                    "Moedas insuficientes: disponível " + MoedasDisponivel + ", necessário " + moedasNecessarias);
            return false;
        }

        return true; // Todos os recursos estão disponíveis
    }

    public void CriarAnimal(Animal animal) {
        if (VerificaRecursosAnimal(animal.ConsumoRacao, animal.MoedasNecessarias)) {
            animais.add(animal);
            MoedasDisponivel -= animal.MoedasNecessarias;
            System.out.println(animal.NomeAnimal + " foi adicionado à fazenda " + NomeFazenda + ".");
        } else {
            System.out.println("Recursos insuficientes para criar " + animal.NomeAnimal);
        }
    }

    public boolean VerificaRecursosAnimal(int racaoNecessaria, int moedasNecessarias) {
        boolean faltaRacao = RacaoDisponivel < racaoNecessaria;
        boolean faltaMoedas = MoedasDisponivel < moedasNecessarias;

        if (faltaRacao) {
            System.out.println("Ração insuficiente: disponível " + RacaoDisponivel + ", necessário " + racaoNecessaria);
            return false;
        }
        if (faltaMoedas) {
            System.out.println(
                    "Moedas insuficientes: disponível " + MoedasDisponivel + ", necessário " + moedasNecessarias);
            return false;
        }

        return true; // Todos os recursos estão disponíveis
    }

    public void AlimentarAnimais() {
        for (Animal animal : animais) {
            if (RacaoDisponivel >= animal.ConsumoRacao) {
                animal.AlimentarAnimal();
                RacaoDisponivel -= animal.ConsumoRacao;
            } else {
                System.out.println("Ração insuficiente para alimentar " + animal.NomeAnimal);
            }
        }
    }

    public void ColetarProducaoAnimais() {
        for (Animal animal : animais) {
            int producao = animal.ColetarProducao();
            MoedasDisponivel += producao;
        }
    }

    public void PassarDia() {
        for (Cultura cultura : culturas) {
            cultura.Crescer();
        }
        for (Animal animal : animais) {
            animal.PassarDia();
        }
    }

}