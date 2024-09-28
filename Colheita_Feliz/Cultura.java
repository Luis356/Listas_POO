public abstract class Cultura {

    protected final String NomeCultura;
    protected int TempoCrescimento;
    protected int DiasCrescimento = 0;
    protected int ValorVenda;
    protected int FertilizanteNecessario;
    protected int AguaNecessaria;
    protected int MoedasNecessarias;
    protected boolean Madura = false;
    protected boolean plantada = false;
    public int Recompensa;

    public Cultura(String nome, int tempo, int valor, int agua, int fertilizante, int moedas) {
        this.NomeCultura = nome;
        this.TempoCrescimento = tempo;
        this.ValorVenda = valor;
        this.AguaNecessaria = agua;
        this.FertilizanteNecessario = fertilizante;
        this.MoedasNecessarias = moedas;
    }

    public boolean VerificaMadura() {
        return Madura;
    }

    public void Plantar() {
        this.plantada = true;
    }

    public void Crescer() {
        if (this.DiasCrescimento < this.TempoCrescimento) {
            this.DiasCrescimento++;
        }
        if (this.DiasCrescimento >= this.TempoCrescimento) {
            this.Madura = true;
        }
    }

    public abstract int Colher();
}
