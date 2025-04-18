public abstract class Essere {
    private String nome;
    private Integer livello;
    private Integer puntiVita;
    private Integer energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getLivello() {
        return livello;
    }

    public void setLivello(Integer livello) {
        this.livello = livello;
    }

    public Integer getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(Integer puntiVita) {
        this.puntiVita = puntiVita;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Essere{" +
                "nome='" + nome + '\'' +
                ", livello=" + livello +
                ", puntiVita=" + puntiVita +
                ", energia=" + energia +
                '}';
    }

    public abstract String descrizione();

    public abstract void combatti(Essere essere);

    public void riceviDanno(Integer danno)  {
        this.puntiVita -= danno;
    }
}
