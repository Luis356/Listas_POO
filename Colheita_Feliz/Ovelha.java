public class Ovelha extends Animal {


    public Ovelha() {
        super("Ovelha", 0, 1, 2, 2);
    }

    @Override
    public int ColetarProducao() {
        return ProducaoDiaria * 2;
    }

}
