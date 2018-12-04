package player;

import itens.Espada;
import itens.Item;

public class Espadachim extends Avatar {

    public Espadachim(String nome){
        super(nome);

        Item espada = new Espada("Espada de Asgard");
        getMochila().add(espada);

        setAgilidade(7);
        setDestreza(8);
        setForca(6 + ((Espada) espada).getAdicionalForca());
        setSorte(7);
        setInteligencia(7);
    }

    public Espadachim(){
        this("Sem nome");
    }
	
}