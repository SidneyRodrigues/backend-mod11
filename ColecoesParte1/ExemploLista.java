package br.com.smorais.array.ColecoesParte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        exemploListaOrdenada();
    }

    private static void exemploListaOrdenada() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Antonio Sousa");
        nomes.add("Sidney Rodrigues");
        nomes.add("Lúcia Ferreira");
        nomes.add("João da Silva");

        Collections.sort(nomes);

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
