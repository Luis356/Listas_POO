public class Batata extends Cultura {

    public Batata() {
        super("Batata", 6, 20, 8, 10, 10);
    }

    @Override
    public int Colher() {
        if (Madura) {
            System.out.println("A " + NomeCultura + " foi colhido, gerando: " + ValorVenda + " moedas");
            return ValorVenda;
        } else {
            System.out.println("A " + NomeCultura + " não está pronto para colher!");
            return 0;
        }

    }
}
