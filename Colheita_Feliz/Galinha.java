public class Galinha extends Animal {

    public Galinha() {
        super("Galinha", 0, 3, 1, 3);
    }

    @Override
    public int ColetarProducao() {
        return ProducaoDiaria * 2;
    }

}
