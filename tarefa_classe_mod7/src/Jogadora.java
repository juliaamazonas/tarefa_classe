//infos sobre jogadoras de um time de Roller Derby

/**
 * @author julia.amazonas
 */

public class Jogadora {

    private int numero;

    private String nome;

    private String derbyName;

    private String posicao;

    private String liga;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getDerbyName() {
        return derbyName;
    }

    public void setDerbyName(String derbyName) {
        this.derbyName = derbyName;
    }


    /**
     * @return o nome de registro da jogadora, não é o nome da atleta durante o jogo.
     *
     * @deprecated
     *
     * @see derbyName
     */
    public void nomeDaJogadora (String nome) {
        setNome(nome);
    }

    public void numeroDaJogadora (int numero) {
        setNumero(numero);
    }

    /**
     *
     * @return o nome da jogadora durante o jogo.
     */

    public void derbyName (String derbyName) {
        setDerbyName(derbyName);
    }

    public void posicaoDaJogadora (String posicao) {
        setPosicao(posicao);
    }

    public void timeDaJogadora (String liga) {
        setLiga(liga);
    }
}


