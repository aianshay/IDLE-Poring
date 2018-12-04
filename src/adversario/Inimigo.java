package adversario;

import player.Avatar;
import itens.*;

public class Inimigo extends Avatar {

    private final static String nomesInimigo[] = {"Vergil", "Mundus", "Lilith", "Arius", "Argosax", "Arkham", "Sanctus",
                                                    "Agnus", "Trish", "Lady", "Sparda", "Eva", "Matier", "Credo", "Kyrie",
                                                    "Goldstein", "Kat", "Ferino"};

    public Inimigo() {
        super(nomesInimigo[(int)(Math.random()*18)]);

        Item i = Item.obterItem();
        getMochila().add(i);

        this.setHp(200);

        setAgilidade(1 + (int) (Math.random() * ((9 - 1) + 1)));
        setDestreza(1 + (int) (Math.random() * ((9 - 1) + 1)));
        setForca(1 + (int) (Math.random() * ((9 - 1) + 1)));
        setSorte(1 + (int) (Math.random() * ((9 - 1) + 1)));
        setInteligencia(1 + (int) (Math.random() * ((9 - 1) + 1)));
    }
    
    public Inimigo(String nome,int hp) {
    	super(nome);
    	this.setHp(hp);
    }
}