package sh.surge.fulgure.fulgure_brasil.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comando, curiosidade, dica, resposta;
    private int tempo, pontuacao;

    public Questao() {
    }

    public Questao(String comando, String curiosidade, String dica, String resposta, int tempo, int pontuacao) {
        this.comando = comando;
        this.curiosidade = curiosidade;
        this.dica = dica;
        this.resposta = resposta;
        this.tempo = tempo;
        this.pontuacao = pontuacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

}
