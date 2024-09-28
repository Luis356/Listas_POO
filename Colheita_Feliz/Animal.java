public class Animal {

    protected String NomeAnimal;
    protected int IdadeAnimal;
    protected int ProducaoDiaria;
    protected int ConsumoRacao;
    protected int MoedasNecessarias;

    public Animal(String nome, int idade, int producao, int consumo, int moedas) {
        this.NomeAnimal = nome;
        this.IdadeAnimal = idade;
        this.ProducaoDiaria = producao;
        this.ConsumoRacao = consumo;
        this.MoedasNecessarias = moedas;
    }

    public void AlimentarAnimal() {
    }

    public int ColetarProducao() {
        return ProducaoDiaria; 
    }

    public void PassarDia() {
        IdadeAnimal++;
    }

}
