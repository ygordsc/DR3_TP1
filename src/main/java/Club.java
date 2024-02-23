public class Club {
    private String nome;
    private String cores;
    private int qtdTorcedores;
    private int rendaMensal;

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setCores(String c) {
        cores = c;
    }

    public String getCores() {
        return cores;
    }

    public void setTorcida(int t) {
        qtdTorcedores = Math.max(t, 0);
    }

    public int getTorcida() {
        return qtdTorcedores;
    }

    public void setRenda(int r) {
        rendaMensal = r;
    }

    public int getRenda() {
        return rendaMensal;
    }

    public int rendaAnual() {
        return rendaMensal * 12;
    }

}

