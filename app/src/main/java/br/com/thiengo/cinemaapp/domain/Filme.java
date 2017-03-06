package br.com.thiengo.cinemaapp.domain;

import java.util.ArrayList;

/**
 * Created by viniciusthiengo on 03/03/17.
 */

public class Filme {
    private String nome;
    private String urlImagem;
    private String synopse;
    private ArrayList<Sala> salas = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getSynopse() {
        return synopse;
    }

    public void setSynopse(String synopse) {
        this.synopse = synopse;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
}
