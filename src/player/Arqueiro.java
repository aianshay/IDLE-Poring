package player;

import itens.Arco;
import itens.Item;

public class Arqueiro extends Avatar {

    public Arqueiro(String nome){
        super(nome);

        Item arco = new Arco("Cajado Uivante");
        getMochila().add(arco);

        setAgilidade(5 + ((Arco) arco).getAdicionalAgilidade());
        setDestreza(7);
        setForca(7);
        setSorte(6);
        setInteligencia(8);
    }

    public Arqueiro(){
        this("Sem nome");
    }
}