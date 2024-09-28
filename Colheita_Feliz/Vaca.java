public class Vaca extends Animal {


    public Vaca() {
        super("Galinha", 0, 5, 2, 5);
    }

    @Override
    public int ColetarProducao() {
        return ProducaoDiaria * 3;
    }

}
