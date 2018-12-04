package player;

import itens.Item;
import itens.Revolver;

public class Ladrao extends Avatar {

    public Ladrao(String nome){
        super(nome);

        Item revolver = new Revolver("Revolver radioativo");
        getMochila().add(revolver);

        setAgilidade(7);
        setDestreza(8 + ((Revolver) revolver).getAdicionalDestreza());
        setForca(8);
        setSorte(7);
        setInteligencia(6);
    }

    public Ladrao(){
        this("Sem nome");
    }

	
}