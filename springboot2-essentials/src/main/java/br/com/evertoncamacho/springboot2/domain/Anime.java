package br.com.evertoncamacho.springboot2.domain;

public class Anime {

    private String name;

    public Anime() {
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
