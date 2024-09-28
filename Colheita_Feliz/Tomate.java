public class Tomate extends Cultura {

    public Tomate() {
        super("Tomate", 4, 10, 3, 5, 5);
    }

    @Override
    public int Colher() {
        if (Madura) {
            System.out.println("O " + NomeCultura + " foi colhido, gerando: " + ValorVenda + " moedas");
            return ValorVenda;
        } else {
            System.out.println("O " + NomeCultura + " não está pronto para colher!");
            return 0;
        }

    }
}
