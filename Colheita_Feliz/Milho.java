public class Milho extends Cultura {

    public Milho() {
        super("Milho", 5, 10, 5, 7, 5);
    }

    @Override
    public int Colher() {
        if (this.Madura) {
            this.plantada = false;
            System.out.println("O " + this.NomeCultura + " foi colhido, gerando: " + ValorVenda + " moedas");
            return ValorVenda;
        } else {
            System.out.println("O " + this.NomeCultura + " não está pronto para colher!");
            return 0;
        }

    }
}
